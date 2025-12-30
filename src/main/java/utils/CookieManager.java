package utils;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;
import java.util.StringTokenizer;

public class CookieManager {

    private static final String FILE_PATH = "cookies.data";

    public static void saveCookies(WebDriver driver) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Cookie ck : driver.manage().getCookies()) {

                String expiry = (ck.getExpiry() == null)
                        ? "null"
                        : String.valueOf(ck.getExpiry().getTime());

                writer.write(ck.getName() + ";" +
                        ck.getValue() + ";" +
                        ck.getDomain() + ";" +
                        ck.getPath() + ";" +
                        expiry + ";" +
                        ck.isSecure());
                writer.newLine();
            }
            System.out.println("Cookies saved successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean loadCookies(WebDriver driver) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;

            while ((line = reader.readLine()) != null) {
                StringTokenizer token = new StringTokenizer(line, ";");

                String name = token.nextToken();
                String value = token.nextToken();
                String domain = token.nextToken();
                String path = token.nextToken();
                String expiryStr = token.nextToken();
                boolean isSecure = Boolean.parseBoolean(token.nextToken());

                Cookie.Builder ck = new Cookie.Builder(name, value)
                        .domain(domain)
                        .path(path);

                if (!expiryStr.equals("null")) {
                    ck.expiresOn(new Date(Long.parseLong(expiryStr)));
                }

                if (isSecure) ck.isSecure(true);

                driver.manage().addCookie(ck.build());
            }

            System.out.println("Cookies loaded successfully!");
            return true;   // IMPORTANT — return TRUE when loaded

        } catch (Exception e) {
            System.out.println("No stored cookies found. CAPTCHA will appear.");
            return false;  // return false only in failure
        }
    }

}

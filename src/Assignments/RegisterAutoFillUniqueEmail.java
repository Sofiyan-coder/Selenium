//package Assignments;
//
//
//
//	import org.openqa.selenium.By;
//	import org.openqa.selenium.chrome.ChromeDriver;
//
//	import java.io.BufferedReader;
//	import java.io.BufferedWriter;
//	import java.io.FileReader;
//	import java.io.FileWriter;
//	import java.io.IOException;
//
//	public class RegisterAutoFillUniqueEmail {
//
//	    private static final String FILE_PATH = "runCount.txt"; // Path to the file where the count is stored
//
//	    public static void main(String[] args) throws InterruptedException {
//	        int runCount = getRunCount(); // Retrieve the current run count from the file
//	        runCount++; // Increment the run count
//	        saveRunCount(runCount); // Save the updated run count back to the file
//
//	        System.out.println("Program run count: " + runCount);
//
//	        ChromeDriver driver = new ChromeDriver();
//	        String expected_url = "https://demowebshop.tricentis.com/";
//	        driver.manage().window().maximize();
//	        driver.get(expected_url);
//	        Thread.sleep(3000);
//	        
//	        String current_url = driver.getCurrentUrl();
//	        String registerPageTitle = driver.getTitle() + ". Register";
//	        
//	        if (expected_url.equals(current_url)) {
//	            driver.findElement(By.className("ico-register")).click();
//	            Thread.sleep(2000);
//	            if (driver.getTitle().equals(registerPageTitle)) {
//	                Thread.sleep(2000);
//	                
//	                driver.findElement(By.id("gender-male")).click();
//	                driver.findElement(By.id("FirstName")).sendKeys("Sofiyan");
//	                driver.findElement(By.id("LastName")).sendKeys("Malidwale");
//	                driver.findElement(By.id("Email")).sendKeys("sofiyan" + runCount + "@gmail.com");
//	                driver.findElement(By.id("Password")).sendKeys("123456");
//	                driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
//	                driver.findElement(By.id("register-button")).click();
//	                
//	                System.err.println("Registration Completed");
//	            } else {
//	                System.out.println("You are not on the Register Web-page");
//	            }
//	        } else {
//	            System.out.println("You are on the Wrong Web-page");
//	        }
//	        Thread.sleep(2000);
//	        driver.close();
//	    }
//
//	    // Method to retrieve the run count from the file
//	    private static int getRunCount() {
//	        int runCount = 0;
//	        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
//	            String line = reader.readLine();
//	            if (line != null) {
//	                runCount = Integer.parseInt(line);
//	            }
//	        } catch (IOException | NumberFormatException e) {
//	            System.out.println("Unable to read the run count. Starting from 0.");
//	        }
//	        return runCount;
//	    }
//
//	    // Method to save the updated run count to the file
//	    private static void saveRunCount(int runCount) {
//	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
//	            writer.write(String.valueOf(runCount));
//	        } catch (IOException e) {
//	            System.out.println("Unable to save the run count.");
//	        }
//	    }
//	}
//
//}

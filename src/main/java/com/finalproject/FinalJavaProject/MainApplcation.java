package com.finalproject.FinalJavaProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class MainApplcation {

    public static void main(String[] args) {
        SpringApplication.run(MainApplcation.class, args);
    }

    @GetMapping("/")
    public String homepage(@RequestParam(defaultValue = "Faig Aliyev Final Project") String user) {
        return """
                <!DOCTYPE html>
                <html lang="en">
                <head>
                  <meta charset="UTF-8">
                  <title>Welcome Page</title>
                  <style>
                    body {
                      margin: 0;
                      padding: 0;
                      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                      background: #f2f4f8;
                      color: #333;
                      display: flex;
                      justify-content: center;
                      align-items: center;
                      min-height: 100vh;
                    }
                
                    .container {
                      background: #ffffff;
                      padding: 40px;
                      border-radius: 15px;
                      box-shadow: 0 8px 20px rgba(0, 0, 0, 0.1);
                      max-width: 700px;
                      text-align: center;
                    }
                
                    h1 {
                      font-size: 2.5em;
                      color: #2b5876;
                      margin-bottom: 10px;
                    }
                
                    p {
                      font-size: 1.1em;
                      margin-bottom: 30px;
                      line-height: 1.6;
                    }
                
                    img {
                      max-width: 100%;
                      border-radius: 10px;
                      box-shadow: 0 4px 12px rgba(0, 0, 0, 0.15);
                    }
                  </style>
                </head>
                <body>
                  <div class="container">
                    <h1>Welcome, Mr. Dominik Bielecki</h1>
                    <p>
                      My name is <strong>Faig Aliyev</strong>, I am from group 3 (ID: 68741).<br>
                      I sincerely hope you enjoy reviewing my project.<br>
                      The image below is a part of my final project — simple, maybe a bit funny, hope you like it :D.
                    </p>
                    <img src="/FaigAliyevFinal.png" alt="Project Image">
                  </div>
                </body>
                </html>
                
            """;
    }
}

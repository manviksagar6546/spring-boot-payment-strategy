# spring-boot-payment-strategy
Demonstrates core Spring Boot concepts including Dependency Injection, IoC Container, Bean lifecycle, Component Scanning, and Conditional Bean Configuration using a payment service example.

# Spring Boot DI & IoC Demo

This project demonstrates fundamental Spring Boot concepts using a simple payment service example.

## 🚀 Concepts Covered

- Bean Creation
- Dependency Injection (Constructor Injection)
- Inversion of Control (IoC)
- ApplicationContext
- Component Scanning
- Auto Configuration
- Conditional Bean Loading (`@ConditionalOnProperty`)

## 🧠 How It Works

The application uses a `PaymentService` interface with multiple implementations:

- StripePaymentService
- RazorpayPaymentService

Spring Boot dynamically injects the required implementation based on configuration.

## ⚙️ Configuration

Set the payment provider in:

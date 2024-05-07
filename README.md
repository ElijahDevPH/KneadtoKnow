# Knead to Know Bakery Management System

# Description
The Knead to Know Bakery Management System is a comprehensive Java-based application designed to facilitate the daily operations of a bakery. This system manages product selections, order calculations, and receipt printing, enhancing the efficiency of service delivery. With an intuitive GUI, the system simplifies interactions, making it easy for staff to perform their duties effectively.

# Features

User Authentication: Manages user sessions and permissions.

Product Management: Allows the selection of bakery items, with adjustable quantities.

Price Calculation: Automatically calculates total prices including taxes based on selected items.

Receipt Printing: Generates a formatted receipt that can be printed, detailing each transaction.

Modern GUI: Provides a user-friendly graphical interface with clear, actionable components.

# Tech Stack

Java: Core programming language.

Swing: GUI toolkit for Java for creating graphical user interfaces.

Java AWT: Used for windowing and rendering.

Java Print API: Manages printing processes

Main Java Files
MainFrame.java: This is the main interface for the bakery management system, handling product selection, order calculations, and receipt generation.
Login.java: Manages user authentication, ensuring that only authorized personnel can access the system functionalities.
Registration.java: Allows new users to register, adding their credentials to the system’s database for subsequent login attempts.

Setup and Installation

# Clone the repository
git clone https://github.com/yourgithubusername/kneadtoknow.git

# Navigate to the project directory
cd kneadtoknow

# Compile the Java files
javac MainFrame.java Login.java Registration.java

# Run the application starting with the login interface
java Login

# Usage
After launching the Login application:

Login: Existing users can log in using their credentials to access the MainFrame of the application.
Registration: New users can register by providing necessary information which then allows them access to the system upon login.
MainFrame: Upon successful login, users can:
Select products and specify quantities.
Use the "Total" button to calculate the total price including tax.
"Confirm" to finalize the transaction and view the total cost, payment input, and change due.
Use the "Receipt" button to print or view the transaction receipt.
"Reset" clears all selections and input fields.

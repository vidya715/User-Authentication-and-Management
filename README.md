# User-Authentication-and-Management
User Authentication and Management
Objective:
The project aims to create a simple command-line application in Java for user authentication and management. It allows users to register, login, update passwords, and check authentication status.

Components:

    User Class:
        Represents a user with properties username and password.
        Provides methods to get and set username and password.

    UserAuthentication Class:
        Manages user authentication functionalities using a HashMap to store users.
        Provides methods for user registration (registerUser), authentication (authenticateUser), password update (updatePassword), and checking login status (isLoggedIn).
        Uses Scanner for user input to simulate interaction.

    Functionality:
        Register User:
            Takes username and password input from the user.
            Checks if the user already exists before registration.
            Prints appropriate messages based on registration status.
        Authenticate User:
            Takes username and password input from the user.
            Validates the provided credentials against stored data.
            Sets the logged-in user if authentication is successful.
            Prints success or failure messages accordingly.
        Update Password:
            Takes username and new password input from the user.
            Updates the password for an existing user.
            Prints a success message if the password is updated successfully.
        Check Authentication:
            Checks if any user is currently logged in.
            Prints the username of the logged-in user or a message indicating no user is logged in.

    Usage:
        The program provides a menu-driven interface via the command line.
        Users select options (1 for registration, 2 for authentication, 3 for password update, 4 for checking authentication status).
        Depending on the selected option, users interact with the program to perform desired operations.

    Compilation and Execution:
        Both User.java and UserAuthentication.java are compiled using the javac command.
        The compiled program (UserAuthentication.class) is run using the java command to execute the functionalities.

Conclusion:

This project demonstrates fundamental concepts of user authentication and management using Java programming language. It provides a basic framework that can be expanded and enhanced for real-world applications, such as integrating with databases for persistent storage, implementing more robust security measures, or developing a graphical user interface (GUI) for better user interaction.

By implementing this project, you gain practical experience in handling user credentials, managing user sessions, and building interactive command-line applications in Java. This foundation can be built upon for more advanced projects or further learning in software development and cybersecurity domains.

# Notepad Clone

A simple, lightweight text editor inspired by Windows Notepad. This Notepad clone, written in Java, offers basic text editing features and a clean, minimalist interface, making it perfect for quick note-taking and simple text editing tasks.

## Features

- **Basic Text Editing**: Create, open, edit, and save text files.
- **User-Friendly Interface**: Simple and intuitive design for ease of use.
- **Cut, Copy, Paste**: Standard clipboard operations.
- **Printing Support**: Print your documents directly from the application.
- **Status Bar**: Shows the current line and column number, and other information.

## Installation

### Prerequisites

- **Java Development Kit (JDK)**: Ensure you have the latest version of the JDK installed. You can download it from [here](https://www.oracle.com/java/technologies/javase-downloads.html).
- **IDE (Optional)**: Use an IDE like IntelliJ IDEA, Eclipse, or NetBeans for easier development and execution.

### Steps

1. **Clone the Repository**:
    ```sh
    git clone https://github.com/anishmaurya088/notepad-clone.git
    ```
2. **Navigate to the Project Directory**:
    ```sh
    cd notepad-clone
    ```
3. **Compile the Code**:
    ```sh
    javac -d bin src/*.java
    ```
4. **Run the Application**:
    ```sh
    java -cp bin Notepad
    ```

Alternatively, you can open the project in your preferred IDE and run the `Notepad.java` file directly.

## Usage

### Opening and Saving Files

- **Open**: Click on `File` > `Open` and select a text file to open.
- **Save**: Click on `File` > `Save` or `Save As` to save your document.

### Editing Text

- **Cut, Copy, Paste**: Use the `Edit` menu or standard keyboard shortcuts (Ctrl+X, Ctrl+C, Ctrl+V).


### Printing

- **Print**: Click on `File` > `Print` to print your document.

## Contributing

We welcome contributions from the community. To contribute:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes and commit them (`git commit -m 'Add some feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Open a pull request.

Please ensure your code adheres to our coding standards and includes appropriate tests.


## Acknowledgements

- Inspired by the simplicity and functionality of the original Windows Notepad.
- Thanks to all contributors who have helped improve this project.

---

![Screenshot of Notepad Clone](icons/scr.png)

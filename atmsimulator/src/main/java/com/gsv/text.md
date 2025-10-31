# Project Development Log

This document serves as a comprehensive development log for the Bank Management System project. It outlines every step and decision behind the code, allowing anyone—even beginners—to understand the rationale and construction of each component. By following along, you should be able to recreate the same functionality from scratch.

---

## Introduction

Every desktop-based Java application that uses a Graphical User Interface (GUI) begins with its main window. In Swing, this is accomplished using the `JFrame` class, which forms the **foundation of every screen** in the application. For our project, the **Login window** will be the first visible screen when the program launches.

---

## Creating the Login Class

### Purpose

The `Login` class represents the **initial window** of the Bank Management System. It introduces users to the application and will eventually contain text fields, buttons, and images for authentication and branding.

Our Objective is to make it look like this  
![img.png](img.png)

### Step 1: Defining the Main Class

Begin by defining a class named `Login` that extends `JFrame`. Inheriting from `JFrame` provides all functionalities needed for a standard Swing window.

```
import javax.swing.*;

public class Login extends JFrame {
public Login() {
// Constructor where window setup will happen
}

    public static void main(String[] args) {
        new Login();
    }
}
```

This sets up the basic window. To make it visually engaging, we will add an image.


### Step 2: Adding and Managing Images

For displaying images in a window, `JLabel` can be used to host images through `ImageIcon`. An `ImageIcon` acts as a wrapper around the image, enabling `JFrame` to render it. You can create an `ImageIcon` by providing a reference to either an image object or a URL.

To fetch an image from a resource path, use:

```java
ImageIcon i1 = new ImageIcon( Objects.requireNonNull( Login.class.getResource( "/icon/bank.png" )));
```

This utilizes the `getResource()` method (a static method available in all classes) to retrieve an image from the `/icon/bank.png` path. Wrapping it with `Objects.requireNonNull()` ensures that if the path is incorrect or the image is missing, an exception is thrown at compile time rather than runtime—helping catch issues early.

### Step 3: Scaling the Image

After loading the image, you’ll often want to scale it for better visual fit. The process involves:

- Extracting the raw image from the `ImageIcon`
- Scaling it to the desired size
- Wrapping the scaled image back into a new `ImageIcon`

Here's the code for image scaling:

```java
// Scaling Image
Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_AREA_AVERAGING);
ImageIcon i3 = new ImageIcon(i2);
```

This creates a scaled version of the icon that is ready for display within your application.

---

*Continue building with this structured approach: use clear headers, concise explanations, and code snippets for each step, ensuring the documentation remains beginner-friendly and easy to follow.*

After this we will add labels: We will declare labels globally, so that they are accessed outside constructor as well.
  
NOTE : 
- `setVisible(true)` should be added at the end.
- The things which are added first will appear above. So background should be added at the end.

After this, we will add labels for `WELCOME TO ATM` , `Card No:` and `Pin`.  
We use JLabel to display text on the frame.  
We can use `.setForeground(Color.WHITE)` to set color of text.  
We can use `.setFont(new Font( "AvantGarde" , Font.BOLD , 38));` to set font of text.


After that, we will add Text fields card number, and Password field for PIN.

After adding all of that, we want to assign action to these buttons, this will be done through ACTION LISTER.  
We will implement ActionListener interface

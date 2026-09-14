# Ethiopian Calendar

A desktop Ethiopian calendar application built with JavaFX. Browse the 13 Ethiopian calendar months, move between months and years, and open the reminder controls from a simple graphical interface.

## Features

- Displays the Ethiopian calendar with month-specific artwork.
- Navigate forward and backward through the 13-month calendar.
- Automatically advances or decreases the displayed year when navigation crosses a year boundary.
- Provides controls for jumping to a year and entering reminder details.
- Uses FXML and CSS resources for the application layout and styling.

## Prerequisites

- Java Development Kit (JDK) 22 or newer.
- Internet access on the first Maven build so Maven can download JavaFX and plugin dependencies.

The project uses JavaFX 22 and the Maven JavaFX plugin. On Windows, use `mvnw.cmd`; on macOS/Linux, use `./mvnw`.

## Run with Maven

From the project root, run:

```bash
# Windows
mvnw.cmd clean javafx:run

# macOS/Linux
./mvnw clean javafx:run
```

To compile and package the project without launching the application:

```bash
mvnw.cmd clean package
```

## Project structure

```text
src/
└── main/
    ├── java/
    │   ├── module-info.java
    │   └── com/example/calenderproject/
    │       ├── EthiopianCalenderApplication.java
    │       └── EthiopianCalenderController.java
    └── resources/
        ├── com/example/calenderproject/hello-view.fxml
        ├── css/style.css
        └── img/                 # Calendar and month artwork
pom.xml                          # Maven and JavaFX configuration
mvnw, mvnw.cmd                    # Maven Wrapper launchers
```

Generated output is written to `target/` and is excluded from version control.

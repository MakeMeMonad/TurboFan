# Contributing to TurboFan

Thank you for your interest in improving TurboFan!  
We welcome new contributors—whether you want to fix bugs, improve documentation, add features, or just ask questions and
chat.

## Quick Start

1. **Fork this repository** and clone it to your local machine.
2. **Create a new branch** off `dev` for your work.
3. **Check the [open issues](https://github.com/MakeMeMonad/TurboFan/issues)** for bugs, feature ideas, or to suggest
   your own.
4. **Open a Pull Request** targeting the `dev` branch when you’re ready.

---

## Requirements

- **IntelliJ IDEA Ultimate** (minimum version 2024.3)
  > *Note: Some APIs (like LSP) require Ultimate. Community Edition won’t work for full development or running the
  plugin.*
- **Java JDK 21**
  > *If not installed, Gradle will download the toolchain automatically.*
- **[Grammar-Kit Plugin](https://plugins.jetbrains.com/plugin/6606-grammarkit)** (install from JetBrains Marketplace)
  > *Required to regenerate the lexer/parser.*

> **Note:**  
> TurboFan uses the JetBrains fork of JFlex, which is required for generating the lexer via Grammar-Kit.  
> You do *not* need to check in or distribute this tool. The Grammar-Kit plugin will prompt you to download the correct
JFlex fork as needed.  
> The `tools/jflex/` directory is git-ignored.

---

## Setup

1. **Clone the repository:**
    ```sh
    git clone https://github.com/MakeMeMonad/TurboFan.git
    cd TurboFan
    ```
2. **Open in IntelliJ IDEA Ultimate.**
3. When prompted, **enable the Gradle IntelliJ Platform plugin**.
4. **Run code generation** for lexer/parser, if you make changes to `.flex` or `.bnf` files:
    - Right-click the file(s) and select “Generate” (requires Grammar-Kit plugin).
    - Or run the Gradle task (if available).

5. **Build and run:**
    - To build:
      ```sh
      ./gradlew buildPlugin
      ```
    - To run/test in a dev IDE instance:
      ```sh
      ./gradlew runIde
      ```

---

## Project Structure

- `src/main/` — main source code for plugin, language, and features
- `src/main/gen/` — generated sources (lexer/parser); do **not** edit manually!
- `tools/` — developer tools/scripts (e.g., JFlex)
- `.github/` — CI, issue templates, PR templates, workflows

---

## Contributing Workflow

1. **Create a new branch** from `dev`:
    ```sh
    git checkout dev
    git checkout -b feature/my-feature
    ```
2. **Make your changes.**
3. **Ensure tests and builds pass locally:**
    ```sh
    ./gradlew test
    ./gradlew buildPlugin
    ```
4. **Commit and push to your fork.**
5. **Open a Pull Request** targeting `dev`.
6. **Request a review** (if applicable).
7. **Describe your changes** clearly, including any context, design decisions, or follow-ups.

---

## Code Generation (Lexer/Parser)

- If you edit `Swift.flex` or `Swift.bnf`, regenerate sources using Grammar-Kit.
- **Generated files are located in `src/main/gen`.**  
  Do not edit these directly!
- If you add/modify rules in the grammar, please include notes or a summary of changes.

---

## Code Style & Standards

- Use **clear, modern, idiomatic Kotlin/Java** (matching project conventions).
- Follow **official JetBrains Platform SDK guidelines** where possible.
- Keep methods/classes focused and well-documented.
- Document *why*, not just *what*.
- Prefer accessibility, clarity, and maintainability.

---

## Accessibility & Inclusion

TurboFan is committed to inclusive, accessible tooling for all users and contributors.  
If you have access needs, requests for accommodations, or suggestions for making this project more accessible,
please [open an issue](https://github.com/MakeMeMonad/TurboFan/issues) or reach out directly.

---

## Community & Help

- **Discussions** and **Issues** are open for questions, ideas, and support.
- Be kind, patient, and supportive—especially with new contributors and access needs.
- All participation is welcome, regardless of experience level or background.

---

## License

By contributing, you agree your contributions are licensed under the project’s open-source license (see `LICENSE`).

---

## Thank you! 💜

You’re making TurboFan better for everyone!  
Whether it’s code, docs, bug reports, or just saying hi, we appreciate you.

---

*Happy coding!*
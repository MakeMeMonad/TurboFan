# TurboFan

![Build](https://github.com/MakeMeMonad/TurboFan/workflows/Build/badge.svg)
![CodeRabbit Pull Request Reviews](https://img.shields.io/coderabbit/prs/github/MakeMeMonad/TurboFan?utm_source=oss&utm_medium=github&utm_campaign=MakeMeMonad%2FTurboFan&labelColor=171717&color=FF570A&link=https%3A%2F%2Fcoderabbit.ai&label=CodeRabbit+Reviews)
[![Version](https://img.shields.io/jetbrains/plugin/v/MARKETPLACE_ID.svg)](https://plugins.jetbrains.com/plugin/MARKETPLACE_ID)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/MARKETPLACE_ID.svg)](https://plugins.jetbrains.com/plugin/MARKETPLACE_ID)
---
<!-- Plugin description -->

## Who ~~Built~~ Is Building TurboFan?

TurboFan is built by Gale, a disabled indie developer passionate about accessibility and modern tooling, with support
from the open source community.
All contributors welcome!

## What is TurboFan?

TurboFan is an in-development plugin for the JetBrains IDE ecosystem, aiming to bring modern, full-featured support for
the Swift language and toolchain to JetBrains editors—especially CLion. Inspired by the legacy of AppCode and the
growing, cross-platform Swift community, TurboFan’s goal is to make Swift development accessible, customizable, and fun
on any platform, for any developer.

## Why Turbofan? (Motivations)

I started TurboFan after a long search for an accessible, extensible, and genuinely usable Swift IDE outside of Xcode.
As a disabled indie developer, I hit wall after wall: Xcode’s accessibility limitations, the shutdown of AppCode,
closed-source plugins, and projects with little interest in outside contributions. Most available tools either lacked
basic features, didn’t support community collaboration, or simply weren’t open.

After trying everything from VSCode to Cursor, to NeoVIM, to CLion, only JetBrains’ IDEs struck the right balance—if
only there was proper Swift support! With AppCode discontinued and other efforts closed to contributors, I decided to
try building my own.

It’s been a massive learning experience—crash-coursing everything from JVM internals and JetBrains plugin APIs, to BNF
grammars and tokenizers—just to get one of my favorite languages working in my favorite IDE. But it’s also been
rewarding, and I’m eager to share what I’ve learned and, hopefully, build a community around it.

## Why Open Source?

The existing options for Swift outside Xcode are limited and often not truly open. I believe that the best tools come
from passionate communities, not gatekeeping. TurboFan is open-source because I want to welcome anyone who’s excited by
this idea: whether you want to contribute code, share feedback, ask questions, or just watch the project grow.

---

## Current Features / Status

- [x] Parsing/tokenizing foundations (experimental)
    - Nearly complete coverage of the Swift 6.1 spec, including single pass lexing of string interpolation.
- [x] Syntax highlighting (partial)
    - Syntax highlighting for most Swift constructs, with full coverage in progress.
- [ ] LSP integration (experimental)
- [ ] Refactoring & navigation (in progress)
    - Hmmm
- [ ] SwiftPM project support (planned)
- [ ] SwiftPM Build System integration (planned)
- [ ] Marketplace release (soon!)

For bleeding-edge status, see the [roadmap](#roadmap) or [issues](https://github.com/MakeMeMonad/TurboFan/issues).

---

## Resources

Want to help? Or just curious? Feel free to open issues and discussions, make suggestions, or drop by and say hi. I love
talking about accessibility, tech, JetBrains APIs, Swift, F#, and all kinds of nerdy topics—don’t be shy!
Whether you want to help, ask questions, or just lurk, you’re always welcome!

---

## Getting Help / Contributing

- See [CONTRIBUTING.md](./CONTRIBUTING.md) for setup, development, and guidelines.
- [Code of Conduct](./CODE_OF_CONDUCT.md): All participation should be respectful and inclusive.
- Questions, ideas, or bug reports? [Open an issue](https://github.com/MakeMeMonad/TurboFan/issues), start
  a [Discussion](https://github.com/MakeMeMonad/TurboFan/discussions), or
  email [maintainers@makememonad.com](mailto:maintainers@makememonad.com).

---

## Roadmap

- [ ] Proper handling of extended delimiters in string literals
- [ ] Full implementation of reference resolution via PsiReference

_(The roadmap is evolving. For the latest, please see [issues](https://github.com/MakeMeMonad/TurboFan/issues)
or [project boards](https://github.com/MakeMeMonad/TurboFan/projects)!)_

---

## Pipes and Dreams

Blue-sky ideas and wild ambitions for TurboFan’s long-term future!

- Full coverage of IntelliJ feature-set via native endpoints.
- Implementations for in-development platform features
    - Workspace API with custom entities
    - Symbols API
- Feature parity with the late AppCode
- Full IDE based upon this foundational plugin

---
<!-- Plugin description end -->

## Installation

⚠️ TurboFan is still in early development and not yet on JetBrains Marketplace.

Stay tuned! Installation instructions will be added here as soon as the first preview is available.

For contributors: see [CONTRIBUTING.md](./CONTRIBUTING.md).

<!--
####  For users:

- Using the IDE built-in plugin system:
  
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd> > <kbd>Search for "TurboFan"</kbd> >
  <kbd>Install</kbd>
  
- Using JetBrains Marketplace:

  Go to [JetBrains Marketplace](https://plugins.jetbrains.com/plugin/MARKETPLACE_ID) and install it by clicking the <kbd>Install to ...</kbd> button in case your IDE is running.

  You can also download the [latest release](https://plugins.jetbrains.com/plugin/MARKETPLACE_ID/versions) from JetBrains Marketplace and install it manually using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>

- Manually:

  Download the [latest release](https://github.com/MakeMeMonad/TurboFan/releases/latest) and install it manually using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>
-->
---

## License

TurboFan is licensed under the [Apache 2.0 License](LICENSE.txt).

Plugin based on the [IntelliJ Platform Plugin Template][template].

---

[template]: https://github.com/JetBrains/intellij-platform-plugin-template

[docs:plugin-description]: https://plugins.jetbrains.com/docs/intellij/plugin-user-experience.html#plugin-description-and-presentation
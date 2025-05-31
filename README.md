# TurboFan

![Build](https://github.com/MakeMeMonad/TurboFan/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/MARKETPLACE_ID.svg)](https://plugins.jetbrains.com/plugin/MARKETPLACE_ID)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/MARKETPLACE_ID.svg)](https://plugins.jetbrains.com/plugin/MARKETPLACE_ID)
---
<!-- Plugin description -->
## Who ~~Built~~ Is Building TurboFan?

TODO: Need an intro here...

## What is TurboFan?
TurboFan is an in-development plugin for the JetBrains IDE ecosystem, aiming to bring modern, full-featured support for the Swift language and toolchain to JetBrains editors—especially CLion. Inspired by the legacy of AppCode and the growing, cross-platform Swift community, TurboFan’s goal is to make Swift development accessible, customizable, and fun on any platform, for any developer.

## Why Turbofan? (Motivations)
I started TurboFan after a long search for an accessible, extensible, and genuinely usable Swift IDE outside of Xcode. As a disabled indie developer, I hit wall after wall: Xcode’s accessibility limitations, the shutdown of AppCode, closed-source plugins, and projects with little interest in outside contributions. Most available tools either lacked basic features, didn’t support community collaboration, or simply weren’t open.

After trying everything from VSCode to Cursor, to NeoVIM, to CLion, only JetBrains’ IDEs struck the right balance—if only there was proper Swift support! With AppCode discontinued and other efforts closed to contributors, I decided to try building my own.

It’s been a massive learning experience—crash-coursing everything from JVM internals and JetBrains plugin APIs, to BNF grammars and tokenizers—just to get one of my favorite languages working in my favorite IDE. But it’s also been rewarding, and I’m eager to share what I’ve learned and, hopefully, build a community around it.

## Why Open Source?
The existing options for Swift outside Xcode are limited and often not truly open. I believe that the best tools come from passionate communities, not gatekeeping. TurboFan is open-source because I want to welcome anyone who’s excited by this idea: whether you want to contribute code, share feedback, ask questions, or just watch the project grow.

---
## Current Features / Status

- [x] Syntax highlighting (Partial)
- [x] Parsing/tokenizing foundations
- [ ] LSP integration (in progress)
- [ ] Project model integration (planned)
- [ ] Refactoring & navigation (planned)
- [ ] SwiftPM project support (planned)
- [ ] Marketplace release (soon!)

For bleeding-edge status, see the [roadmap](#roadmap) or [issues](https://github.com/MakeMeMonad/TurboFan/issues).

---
## Resources
Want to help? Or just curious? Feel free to open issues, make suggestions, or drop by and say hi. I love talking about accessibility, language design, JetBrains APIs, Swift, F#, and all kinds of nerdy topics—don’t be shy!

---
## Installation
**TurboFan is still in early development.**  
Not yet on JetBrains Marketplace—installation instructions will appear here when a preview is available.

For contributors: see [CONTRIBUTING.md](./CONTRIBUTING.md).

---
## Getting Help / Contributing
- See [CONTRIBUTING.md](./CONTRIBUTING.md) for setup, development, and community guidelines.
- [Code of Conduct](./CODE_OF_CONDUCT.md): All participation should be respectful and inclusive.
- Questions, ideas, or bug reports? [Open an issue](https://github.com/MakeMeMonad/TurboFan/issues) or
  email [maintainers@makememonad.com](mailto:maintainers@makememonad.com).
- Discussions: (link here if enabled!)

---
## Roadmap
- [ ] Full implementation of reference resolution via PsiReference
- [ ] Two

_(For the latest roadmap, see [issues](https://github.com/MakeMeMonad/TurboFan/issues)
or [project boards](https://github.com/MakeMeMonad/TurboFan/projects)!)_

---
## Pipes and Dreams
eventually be a whole multi-platofmr Swift/Obj-C/C++/C IDE based on the IntelliJ platform

---
## License
TurboFan is licensed under the [Apache 2.0 License](./LICENSE.md).

---
<!-- Plugin description end -->

## Installation

### For Contributors (and the super curious)
See CONTRIBUTORS.md for information on setup.

### For Prospective Users:

⚠️ TurboFan isn’t on JetBrains Marketplace just yet!
Stay tuned—installation instructions will be added here as soon as the first preview is available.

<!--
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
Plugin based on the [IntelliJ Platform Plugin Template][template].

[template]: https://github.com/JetBrains/intellij-platform-plugin-template
[docs:plugin-description]: https://plugins.jetbrains.com/docs/intellij/plugin-user-experience.html#plugin-description-and-presentation
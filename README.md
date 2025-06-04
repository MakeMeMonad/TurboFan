# TurboFan

![Build](https://github.com/MakeMeMonad/TurboFan/workflows/Build/badge.svg)
![CodeRabbit Pull Request Reviews](https://img.shields.io/coderabbit/prs/github/MakeMeMonad/TurboFan?utm_source=oss&utm_medium=github&utm_campaign=MakeMeMonad%2FTurboFan&labelColor=171717&color=FF570A&link=https%3A%2F%2Fcoderabbit.ai&label=CodeRabbit+Reviews)
[![Version](https://img.shields.io/jetbrains/plugin/v/MARKETPLACE_ID.svg)](https://plugins.jetbrains.com/plugin/MARKETPLACE_ID)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/MARKETPLACE_ID.svg)](https://plugins.jetbrains.com/plugin/MARKETPLACE_ID)
---
<!-- Plugin description -->

## Overview of this document in plain language.

[Skip to Table of Contents...](#table-of-contents)

Todo: Write this up next.

---
[Scroll to Top](#overview-of-this-document-in-plain-language)

## Table of Contents

#### Information about our intentions, motivations, and decisions thus fa:.

- [Who?](#who-built-is-building-turbofan)
- [What?](#what-is-turbofan)
- [Why TurboFan?](#why-build-turbofan-motivations)
- [Why Not *SomeOtherThing*?](#why-not-build-something-else-alternatives)
- [Why FOSS?](#why-open-source)

#### Information about the TurboFan project and its development:

- [Roadmap](#roadmap)
    - [Active and in-progress work, plus near-term plans.](#active-work-and-near-term-plans)
    - [Long-term hopes, dreams, and pipe-dreams for what TurboFan could become.](#pipes-and-dreams)
- [Current Status](#current-status)
    - [Current IntelliJ features that are implemented or being worked on now.](#intellij-platform-current-api)
    - [Future IntelliJ Platform API we're watching excitedly...](#intellij-platform-next-gen-api)
    - [Features that are still provided via LSP...](#provided-by-sourcekit-lsp)
- [Resources / Getting Help / Contributing](#resources--getting-help--contributing)
    - [Discover how to contribute to TurboFan...](\.CONTRIBUTING.md)
    - [Browse the discussion threads...]()
    - [Start a new discussion thread...]()
    - [Browse our open issues...]()
    - [Open up a new issue...]()
    - [View our Code of Conduct...]()

#### Technicals:

- [Installation](#installation)
- [License](#license)
    - [LICENSE.txt]()

---
[Scroll to Top](#overview-of-this-document-in-plain-language)

## Who ~~Built~~ Is Building TurboFan?

TurboFan is built by Gale, a former hydromechanical repair technician and indie developer passionate about
accessibility, modern developer tooling, and using the advances of machine learning for good.

TurboFan is made possible with support and inspiration from the open source community.
All contributors are welcome!

## What is TurboFan?

TurboFan is an in-development plugin for the JetBrains IntelliJ Platform. TurboFan is intended to bring modern,
full-featured support for the Swift language and toolchain to JetBrains editor products—especially CLion.

Inspired by the legacy of AppCode, and the growing, cross-platform Swift community, TurboFan’s goal is to make Swift
development accessible, customizable, and fun for any and every developer interested in coding with Swift.

Most of all, TurboFan is a response to the inadequacy of Xcode and VSCode to meet the needs of large swaths of modern
developers, including disabled devs, and anyone who just wants to build awesome tools for their IDE and the language
they enjoy most.

## Why Build Turbofan? (Motivations)

I started TurboFan after a long search for an accessible, extensible, and genuinely usable Swift IDE outside of Xcode.
As a disabled indie developer with endless ideas for creating better dev tools, I hit wall after wall as I spent the
past six months finally learning how to program. From my first experiences with Xcode back in January, it was clear to
me that this would be yet another long journey of building my own solutions to structural problems.

Xcode and macOS may have class-leading accessibility, and Apple may delight in raising that bar year after year, but
that same bar is still regularly used for limbo competitions. It is not enough, and I'm not the type to settle for "Hey,
it's only half broken, so it's fine!" as an answer. To add insult to injury, Xcode has been locked down since version 8,
and it's clear that the Alcatraz days are long gone. Fixing things myself would not be possible with the half-baked
alternatives that Apple approves of, even with the myriad open-source tools the Swift team has developed. I'd love to
build a dozen SwiftPM accessibility and productivity enhancements that Apple seems perennially allergic to even
considering. If they ever give developers the proper endpoints to do so, I remain intent on doing just that.

AppCode, the discontinued IDE that I wish JetBrains had continued supporting, was "sunset" years before I knew what a
.jar or plist was, along with the closed-source plugin that used to bring Swift to CLion as well.

The only active attempt to replicate that plugin I could find was also closed-source and soon-to-be-paid via
subscription model. Two years in the making, it appears to have a ways to go before reaching the levels of integration
with the underlying IntelliJ Platform that I need and intend to achieve with TurboFan. While I would've much rather
joined in contributing to an existing project to improve it, this one was vocally opposed to outside contributions.

Disappointed yet still undeterred, I resolved to build TurboFan on my own. Thus began a month-long journey into the wide
worlds of Java, Kotlin, IntelliJ, JFlex, BNF, and a whole new universe of unreadable, inaccessible, or plain nonexistant
documentation. And what a month it has been. This endeavor has been a massive learning experience that I'm very grateful
for.

While I may have bit off just a bit more than I could chew at first, the bevy of new skills that I had to learn are sure
to be worth it in the end. Even at this as-yet-early stage, I feel a new level of confidence in my ability to work with
complex systems and solve problems effectively in new domains with new languages. This has been a
highly rewarding experience, one that's still only just beginning, and I’m beyond eager to share what I’ve learned, to
learn from the wider community in return, and, hopefully, to build a community around this nascent effort to bring
proper accessibility and full extensibility back to the Swift and Apple dev communities.

## Why Not Build Something Else? (Alternatives)

// TODO: Write this soon.

## Why Open Source?

// TODO: Rewrite this soon.

The existing options for Swift outside Xcode are limited and often not truly open. I believe that the best tools come
from passionate communities, not gatekeeping. TurboFan is open-source because I want to welcome anyone who’s excited by
this idea: whether you want to contribute code, share feedback, ask questions, or just watch the project grow.

---
[Scroll to Top](#overview-of-this-document-in-plain-language)

## Roadmap

#### Active work and near-term plans:

- [x] Proper handling of extended delimiters in Swift string literals.
- [ ] Complete implementation of SyntaxHighlighting via HighlightingLexer.
- [ ] Finish improving initial documentation.
- [ ] Complete the refactoring of README.md
- [ ] Release: Alpha && Marketplace Early Access
    - [ ] Get it stable enough for people to try out and tinker with, without getting super frustrated or anything
    - [ ] Ponder life, the universe, and how SemVer is *really* supposed to work.
        - [ ] Just gen a random Double 0\.2\.\*\.\.\<0\.5\.\* \'cause that "feels like an alpha-ish range"
- [ ] Full implementation of reference resolution via PsiReference

#### Pipes and Dreams™:

TODO: Rewrite this soon.

---
[Scroll to Top](#overview-of-this-document-in-plain-language)

## Current Status

Our current feature-set is powered by a mix of IntelliJ Platform API, and the SourceKit-LSP language server. This
balance will shift over time, as implementation of all available features is completed in the full-fat IntelliJ Platform
API (eg. PsiReferenceContributor, HighlightingLexer, RenameSupport). This is to ensure the highest level of support and
quality for Swift on JetBrains IDE products.

Our current focus is on achieving full-support of all IntellliJ Platform features via the current/legacy API (eg. PSI,
Project Structure Model). As the in-development IntelliJ API (eg. 'Workspace' Model, "Custom Entities", 'Symbols')
become stable, we will shift resources towards implementing the newer API as well, building upon the success of our
in-progress PSI-based functionality wherever reasonable.

#### IntelliJ Platform Current API:

- [x] Parsing/tokenizing foundations (implemented, in testing)
    - Nearly complete coverage of the Swift 6.1 spec, including single pass lexing of string interpolation.
- [x] LSP Integration (implemented, in testing)
    - STATUS: Implemented. Limited in availability.
    - ACTIVITY: Bug-fixes and better configuration are actively in progress.
    - DETAILS: Implemented via JetBrains first-party API. JetBrains restricts this API, and it is only available for
      PyCharm Unified (free), as well as their Ultimate/Pro IDEs (Paid).
    - OUTLOOK: We aim to replace this integration with full, native, IntelliJ Platform support over time. We are
      commited to ensuring the best, and most widely available, user experience possible.
- [ ] Syntax highlighting (partial, in progress)
    - STATUS: Underlying functionality implemented. Highlighting is available for many Swift constructs.
    - ACTIVITY: Bug-fixes and a complete implementation are in progress.
    - DETAILS: Based upon 'HighlightingLexer'
    - OUTLOOK:
- [ ] PSI Reference Resolution (partial, on hold)
    - STATUS: Underlying foundation is implemented. One full implementation is in place as a proof of concept.
    - ACTIVITY: Further work on PSI Reference Resolution is on hold until Syntax Highlighting implementation is
      complete.
    - DETAILS: Based upon `PsiReferenceContributor`, `PsiReferenceProvider`, and `PsiReference` classes.
    - OUTLOOK: Navigation and related functionality are provided by SourceKit-LSP for now.
- [ ] SwiftPM Project Support (future, in planning)
    - STATUS:
    - ACTIVITY:
    - DETAILS:
    - OUTLOOK:
- [ ] Other stuff..?
- [ ] SwiftPM Build System integration (future, exploring options)
    - STATUS:
    - ACTIVITY:
    - DETAILS:
    - OUTLOOK:

#### IntelliJ Platform Next-Gen API:

- [ ] `Workspace API` (future)
    - STATUS: Waiting on third-party plugin availability of `Custom Entities`.
    - ACTIVITY:
    - DETAILS:
    - OUTLOOK:
- [ ] `Symbols API` (future)
    - STATUS: Waiting on general availability/stability of the `Symbols` API.
    - ACTIVITY:
    - DETAILS:
    - OUTLOOK:

#### Provided by SourceKit-LSP:

- A lot... Need to get this list done.

---
[Scroll to Top](#overview-of-this-document-in-plain-language)

## Resources / Getting Help / Contributing

Want to help? Or just curious? Feel free to open issues and discussions, make suggestions, or drop by and say hi. I love
talking about accessibility, tech, JetBrains APIs, Swift, F#, and all kinds of nerdy topics—don’t be shy!
Whether you want to help, ask questions, or just lurk, you’re always welcome!

- See [CONTRIBUTING.md](./CONTRIBUTING.md) for setup, development, and guidelines.
- [Code of Conduct](./CODE_OF_CONDUCT.md): All participation should be respectful and inclusive.
- Questions, ideas, or bug reports? [Open an issue](https://github.com/MakeMeMonad/TurboFan/issues), start
  a [Discussion](https://github.com/MakeMeMonad/TurboFan/discussions), or
  email [maintainers@makememonad.com](mailto:maintainers@makememonad.com).

---
[Scroll to Top](#overview-of-this-document-in-plain-language)
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
[Scroll to Top](#overview-of-this-document-in-plain-language)

## License

TurboFan is licensed under the [Apache 2.0 License](LICENSE.txt).

Plugin based on the [IntelliJ Platform Plugin Template][template].

---
[Scroll to Top](#overview-of-this-document-in-plain-language)

[template]: https://github.com/JetBrains/intellij-platform-plugin-template

[docs:plugin-description]: https://plugins.jetbrains.com/docs/intellij/plugin-user-experience.html#plugin-description-and-presentation
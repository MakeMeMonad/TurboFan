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

#### Information about the intentions, motivations, and decisions behind TurboFan.

- [Who?](#who-built-is-building-turbofan)
- [What?](#what-is-turbofan)
- [Why TurboFan?](#why-build-turbofan-motivations)
- [Why FOSS?](#why-build-in-public-why-open-source)

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

TurboFan is built by Gale, a former repair technician and noob indie developer. Gale is passionate about
accessibility, modern developer tooling, and using the advances of machine learning for good.

TurboFan is made possible with support and inspiration from the open source community.
All contributors are welcome!

## What is TurboFan?

TurboFan is an in-development plugin for the JetBrains IntelliJ Platform. TurboFan is intended to bring modern,
full-featured support for the Swift language and toolchain to JetBrains editor products—especially CLion.

Inspired by the legacy of AppCode, and the growing, cross-platform Swift community, TurboFan’s goal is to make Swift
development accessible, customizable, and fun for any and every developer interested in coding with Swift.

Most of all, TurboFan is a response to the inadequacy of Xcode and VSCode to meet the needs of many
developers, including disabled devs, and anyone who just wants to build awesome tools for their preferred IDE and
language.

## Why Build Turbofan? (Motivations)

#### And why not just build something else?

I started TurboFan after a long search for an accessible, extensible, and genuinely usable Swift IDE outside of Xcode.
As a disabled indie developer with endless ideas for creating better dev tools, I hit wall after wall spending the
past six months learning how to program. From my first experiences with Xcode back in January, it was clear to
me that this would be yet another long journey of building my own solutions to structural problems.

Xcode and macOS may have class-leading accessibility, and Apple may delight in raising that bar year after year, but
that same bar is still regularly used for limbo competitions. It is not enough, and I'm not the type to settle for "Hey,
it's only half broken, so it's fine!" as an answer. To add insult to injury, Apple locked down Xcode in version 8, and
it's clear that the Alcatraz days won't be coming back. 'XCSourceEditorExtension' was intertesting to explore, but it's
limitations prevented most of the use-cases I had in mind. The need to pipe data over `XPC` serialized to
`NSSecureCoding` further complicated my attempts at *creative* usages of the only official path to an Xcode "plugin".
SwiftPM BuiltTool, XcodeBuildTool, and Command plugins are a more recent, and slightly more useful, development.
Unfortunately, the `BuildTool` options are just that, build tools. They run during a build, full stop. The command tools
are hobbled in similar ways to`XCSourceEditorExtension`, but will less Mach, Objective-C, and the inane type
restrictions of `NSSecureCoding`. Better? Yes. Good? No. After shelving or throwing away more projects than I care to
admit over about 4 months of learning Swift and the Apple platform, I reached an unfortunate realization. Fixing things
myself would scarcely be possible with the half-baked alternatives that Apple approves of, even with the myriad
open-source tools the Swift team has developed. I'd love to just sit down and build a dozen SwiftPM/Xcode accessibility
and productivity enhancements right now. All the things that Apple seems perennially allergic to even considering. If
they ever give developers the access or proper endpoints to do so, I remain intent on doing just that.

AppCode, the discontinued IDE that I wish JetBrains had kept developing, was "sunset" years before I knew what a
.jar or plist was. The first-party closed-source plugin that used to bring Swift to CLion met a similar fate.

The only active attempt to replicate that plugin I could find was also closed-source and soon-to-be-paid via
subscription model. Two years in the making, it appears to have a ways to go before reaching the levels of integration
with the underlying IntelliJ Platform that I need and intend to achieve with TurboFan. While I would've much rather
joined in contributing to an existing project to improve it, this one was vocally opposed to outside contributions.

Disappointed, yet undeterred, I resolved to begin building a solution myself. Thus began a month-long journey into
the wide worlds of Java, Kotlin, IntelliJ, JFlex, BNF. This included a much more familiar journey into the vast sea of
unreadable, inaccessible, or non-existent developer documentation for *everything*. Well, with the notable exception of
Java, which has a very well-written manual available freely online, all in one place. Shout out to Oracle for the
excellent resources at [Dev.Java](https://dev.java/learn/). These were a breath of fresh air for someone like myself.
I'd grown accustomed to trawling through the typical two-hundred lines of uncommented and overloaded function signatures
in a generated header that Apple calls "developer documentation." I'd almost forgotten what a good set of docs was like
to read. Well, *try* to read. Apple's shockingly bad TTS system continues to be the bane of my existance. It's actually
broken in new and exciting ways just since I started this project. I'll save the details on that for a proper blog/rant
about the state of Apple's flailing accessibility efforts.

While I may have bitten off more than I could chew at first, the bevy of new skills I've learned along the way are sure
to be worth it in the end. Even at this early stage, I feel a new level of confidence in my ability to work with complex
systems. Solving difficult problems effectively in new domains with new languages is challenging but exciting, though a
bit frustrating as the only option available. Being boxed-in is not my favorite circumstance, but it's never stopped me.
All things considered, this has been a highly rewarding experience, one that's still only just beginning, and I’m beyond
eager to share what I’ve learned, to learn from the wider community in return, and, hopefully, to build a community
around this nascent effort to bring proper accessibility and full extensibility back to the Swift and Apple dev
communities.

## Why Build in Public? Why Open Source?

// TODO: Rewrite this soon.

The existing options for Swift outside Xcode are limited and often not truly open. I believe that the best tools come
from passionate communities, not gatekeeping. TurboFan is open-source because I want to welcome anyone who’s excited by
this idea: whether you want to contribute code, share feedback, ask questions, or just watch the project grow.

---
[Scroll to Top](#overview-of-this-document-in-plain-language)

## Roadmap

#### Active work and near-term plans:

- [x] Proper handling of extended delimiters in Swift string literals.
- [x] Complete implementation of lexer-based *syntactic* highlighting via HighlightingLexer.
- [ ] Fix a few more lexing(a.k.a. tokenizing) (.flex) and parsing (.bnf) bugs.
- [ ] Implement post-parser *semantic* highlighting via PsiElement tree-walking visitor/annotator setup
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
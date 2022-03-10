# Minimality Template

*"I just want to make a mod! Don't want to mess with these dang tools!"*

## Setup

### Using the template

***Don't clone this repository unless you're contributing to it.***<br>
Instead, follow these steps to create your own repository:

1. Press the [[Use this template]](https://github.com/Minimality/Mod-Template/generate) button in the top right.
2. If given the option, select an owner.
3. Give your mod a name. It must not have spaces, but dashes and underscores are OK.
4. Optionally, write a description here (you can copy to the README and your `mod.json` file later)
5. Choose whether to make the source code private or public
6. Press [Create repository from template] to finish creating your repository

### Cloning your repository

0. Return to you main repository page
1. Click the <> button to open the get code menu
2. Press the ⏹ two squares button to copy the Git URL
3. Open your favorite Git manager (IntelliJ IDEA has a Git plugin for this) and paste this URL to clone the repository.
  To clone from the commandline, use the `git clone` command.

### Personalizing your repository

- **Delete the README.md file.** It will no longer be applicable to your repository.
- **Change your package name in the file path and in `gradle.properties`**. It should match a domain you own.
For instance, if you own `halotroop.com` and your mod id is `modid` it should be `com.halotroop.modid`.

- If your mod will be open source, it's recommended you choose a new license. CC0 has no attribution clause.
- If you wish to reserve exclusive copyright, you should delete the LICENCE file.

### IDE Extensions

You should install/enable these plugins to IntelliJ IDEA to make your modding experience easier.

- Git (bundled)
  - Support for commit, push, and managing remotes
- GitHub (bundled)
  - Support for managing pull requests and remote repositories
- Gradle (bundled)
  - Support for Gradle buildscripts
  - Integration with Gradle tasks
- Groovy (bundled)
  - Support for the Groovy programming language used in Gradle buildscripts
- [Minecraft Development (by Minecraft-Dev)](https://plugins.jetbrains.com/plugin/8327-minecraft-development)
  - Minecraft mod project generators (not needed when using this template)
  - Hints for `fabric.mod.json` and `modid.mixins.json` files
  - Tools and integration for Mixins

## License

This template is available under the CC0 license. Feel free to learn from it and incorporate it in your own projects.

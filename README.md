# [Striking Entrance](https://www.spigotmc.org/resources/32114/)

[![pipeline status](https://gitlab.com/NatoBoram/StrikingEntrance/badges/master/pipeline.svg)](https://gitlab.com/NatoBoram/StrikingEntrance/-/commits/master)
[![StackShare](https://img.shields.io/badge/tech-stack-0690fa.svg?style=flat)](https://stackshare.io/NatoBoram/strikingentrance)

Personally, I love lightning bolts. If you are in need of a more striking experience with added useless Lightning Bolts, then this is for you!

## Features

### Lightning Bolts

- Someone dies
- Someone joins the server
- Someone quits the server

I am in great need of suggestions. Feel free to ask!

## Dependencies

### Windows

Use [scoop](https://scoop.sh/) to install dependencies.

```batch
scoop bucket add extras
scoop bucket add java
scoop install maven openjdk vscode
```

### Linux

```bash
sudo snap install vscode
sudo apt install default-jdk maven
```

## Build

Open in VSCode then run these commands.

```shell
mvn eclipse:eclipse
mvn package
```

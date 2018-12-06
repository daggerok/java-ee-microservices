#!/usr/bin/env bash
RELEASE_VERSION=1.0.0
DEVELOPMENT_VERSION=1.0.1-SNAPSHOT
#mvn --batch-mode release:update-versions
mvn --batch-mode release:prepare

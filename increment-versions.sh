#!/usr/bin/env bash
mvn --batch-mode \
  release:prepare \
  release:perform \
  release:clean \
    -DgenerateBackupPoms=false

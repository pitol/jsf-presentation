jsf-presentation
================

Very simple, quick (and kind of dirty) JSF 2.2 (JaveEE 7) example.
It requires Java 8, though it is still not using any of the new features.

Its functionality is just letting a user save some text notes that look kind of like a post-it.
It is supposed to demonstrate the very basics of a JSF application, and tries to illustrate the JSF lifecycle with a few simple event listeners.

It was generated with maven, using the codehaus webapp-javaee7 archetype, like so:

```shell
$ mvn -DarchetypeGroupId=org.codehaus.mojo.archetypes \
    -DarchetypeArtifactId=webapp-javaee7 \
    -DarchetypeVersion=1.1 \
    -DgroupId=ppitol \
    -DartifactId=jsf-presentation \
    -Dpackage=ppitol.jsf \
    -Darchetype.interactive=false \
    --batch-mode \
    --update-snapshots \
    archetype:generate
```

It was developed and tested with wildfly 8.1, run it using wildfly's maven plugin like so:

```shell
$ mvn wildfly:run
```

If you have a proper wildfly installation, you can use:

```shell
$ mvn -Djboss-as.home=/path/to/wildfly-8.1 wildfly:run
```

When saving the notes and redisplaying the page, check the wildfly console (the shell, when running with maven) to see the event listener's messages for the lifecycle and application events.

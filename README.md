# info

This fork of jsweet quickstart project is meant for issue reporting purposes only.

# error details

/Library/Java/JavaVirtualMachines/jdk1.8.0_73.jdk/Contents/Home/bin/java "-Dmaven.home=/Applications/IntelliJ IDEA 15.app/Contents/plugins/maven/lib/maven3" "-Dclassworlds.conf=/Applications/IntelliJ IDEA 15.app/Contents/plugins/maven/lib/maven3/bin/m2.conf" -Didea.launcher.port=7540 "-Didea.launcher.bin.path=/Applications/IntelliJ IDEA 15.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath "/Applications/IntelliJ IDEA 15.app/Contents/plugins/maven/lib/maven3/boot/plexus-classworlds-2.4.jar:/Applications/IntelliJ IDEA 15.app/Contents/lib/idea_rt.jar" com.intellij.rt.execution.application.AppMain org.codehaus.classworlds.Launcher -Didea.version=15.0.3 install
[INFO] Scanning for projects...
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building JSweet quick start 1.0.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- jsweet-maven-plugin:1.2.0:jsweet (generate-js) @ jsweet-quickstart ---
[INFO] JSweet transpiler version 1.2.0 (build date: 2016-12-16 11:22:33)
[INFO] dependencies=[Dependency {groupId=org.jsweet.candies, artifactId=jsweet-core, version=1.2.0-SNAPSHOT, type=jar}, Dependency {groupId=org.jsweet.candies, artifactId=j4ts, version=0.2.0-SNAPSHOT, type=jar}, Dependency {groupId=org.jsweet.candies, artifactId=jquery, version=1.10.0-SNAPSHOT, type=jar}]
[INFO] candies detection: add project dependency Dependency {groupId=org.jsweet.candies, artifactId=jsweet-core, version=1.2.0-SNAPSHOT, type=jar} => org.jsweet.candies:jsweet-core:jar:1.2.0-SNAPSHOT:compile
[INFO] candies detection: add project dependency Dependency {groupId=org.jsweet.candies, artifactId=j4ts, version=0.2.0-SNAPSHOT, type=jar} => org.jsweet.candies:j4ts:jar:0.2.0-SNAPSHOT:compile
[INFO] candies detection: add project dependency Dependency {groupId=org.jsweet.candies, artifactId=jquery, version=1.10.0-SNAPSHOT, type=jar} => org.jsweet.candies:jquery:jar:1.10.0-SNAPSHOT:compile
[INFO] all candies artifacts: [org.jsweet.candies:j4ts:jar:0.2.0-SNAPSHOT:compile (1; enabled), org.jsweet.candies:jsweet-core:jar:1.2.0-SNAPSHOT:compile (1; enabled), org.jsweet.candies:sprintf-js:jar:0.0.0-SNAPSHOT:compile (2; enabled), org.jsweet.candies:jquery:jar:1.10.0-SNAPSHOT:compile (1; enabled)]
[INFO] candies jars: [/Users/rafal.ostrowski/.m2/repository/org/jsweet/candies/j4ts/0.2.0-SNAPSHOT/j4ts-0.2.0-SNAPSHOT.jar, /Users/rafal.ostrowski/.m2/repository/org/jsweet/candies/jsweet-core/1.2.0-SNAPSHOT/jsweet-core-1.2.0-SNAPSHOT.jar, /Users/rafal.ostrowski/.m2/repository/org/jsweet/candies/sprintf-js/0.0.0-SNAPSHOT/sprintf-js-0.0.0-SNAPSHOT.jar, /Users/rafal.ostrowski/.m2/repository/org/jsweet/candies/jquery/1.10.0-SNAPSHOT/jquery-1.10.0-SNAPSHOT.jar]
[INFO] classpath from maven: /Users/rafal.ostrowski/.m2/repository/org/jsweet/candies/j4ts/0.2.0-SNAPSHOT/j4ts-0.2.0-SNAPSHOT.jar:/Users/rafal.ostrowski/.m2/repository/org/jsweet/candies/jsweet-core/1.2.0-SNAPSHOT/jsweet-core-1.2.0-SNAPSHOT.jar:/Users/rafal.ostrowski/.m2/repository/org/jsweet/candies/sprintf-js/0.0.0-SNAPSHOT/sprintf-js-0.0.0-SNAPSHOT.jar:/Users/rafal.ostrowski/.m2/repository/org/jsweet/candies/jquery/1.10.0-SNAPSHOT/jquery-1.10.0-SNAPSHOT.jar
[INFO] jsOut: /Users/rafal.ostrowski/Projects/ostryhub/jsweet-quickstart/target/js
[INFO] bundle: false
[INFO] tsOut: /Users/rafal.ostrowski/Projects/ostryhub/jsweet-quickstart/target/ts
[INFO] tsOnly: false
[INFO] declarations: false
[INFO] definitions: false
[INFO] disableJavaAddons: false
[INFO] declarationOutDir: null
[INFO] candiesJsOutDir: /Users/rafal.ostrowski/Projects/ostryhub/jsweet-quickstart/webapp
[INFO] ecmaTargetVersion: ES3
[INFO] moduleKind: none
[INFO] sourceMap: false
[INFO] sourceRoot: null
[INFO] verbose: true
[INFO] jdkHome: /Library/Java/JavaVirtualMachines/jdk1.8.0_73.jdk/Contents/Home/jre
2017-02-20 17:33:32.032 DEBUG JSweetConfig:88 - tools.jar already in classpath
2017-02-20 17:33:32.032 INFO  JSweetTranspiler:248 - creating transpiler version 1.2.0 (build date: 2016-12-16 11:22:33)
2017-02-20 17:33:32.032 INFO  JSweetTranspiler:249 - curent dir: /Users/rafal.ostrowski/Projects/ostryhub/jsweet-quickstart/.
2017-02-20 17:33:32.032 INFO  JSweetTranspiler:250 - tsOut: /Users/rafal.ostrowski/Projects/ostryhub/jsweet-quickstart/target/ts - /Users/rafal.ostrowski/Projects/ostryhub/jsweet-quickstart/target/ts
2017-02-20 17:33:32.032 INFO  JSweetTranspiler:251 - jsOut: /Users/rafal.ostrowski/Projects/ostryhub/jsweet-quickstart/target/js - /Users/rafal.ostrowski/Projects/ostryhub/jsweet-quickstart/target/js
2017-02-20 17:33:32.032 INFO  JSweetTranspiler:252 - candyJsOut: /Users/rafal.ostrowski/Projects/ostryhub/jsweet-quickstart/webapp
2017-02-20 17:33:32.032 DEBUG JSweetTranspiler:253 - compile classpath: /Users/rafal.ostrowski/.m2/repository/org/jsweet/candies/j4ts/0.2.0-SNAPSHOT/j4ts-0.2.0-SNAPSHOT.jar:/Users/rafal.ostrowski/.m2/repository/org/jsweet/candies/jsweet-core/1.2.0-SNAPSHOT/jsweet-core-1.2.0-SNAPSHOT.jar:/Users/rafal.ostrowski/.m2/repository/org/jsweet/candies/sprintf-js/0.0.0-SNAPSHOT/sprintf-js-0.0.0-SNAPSHOT.jar:/Users/rafal.ostrowski/.m2/repository/org/jsweet/candies/jquery/1.10.0-SNAPSHOT/jquery-1.10.0-SNAPSHOT.jar
2017-02-20 17:33:32.032 DEBUG JSweetTranspiler:254 - runtime classpath: /Applications/IntelliJ IDEA 15.app/Contents/plugins/maven/lib/maven3/boot/plexus-classworlds-2.4.jar:/Applications/IntelliJ IDEA 15.app/Contents/lib/idea_rt.jar
2017-02-20 17:33:32.032 INFO  CandiesProcessor:115 - candies processor classpath: /Users/rafal.ostrowski/.m2/repository/org/jsweet/candies/j4ts/0.2.0-SNAPSHOT/j4ts-0.2.0-SNAPSHOT.jar:/Users/rafal.ostrowski/.m2/repository/org/jsweet/candies/jsweet-core/1.2.0-SNAPSHOT/jsweet-core-1.2.0-SNAPSHOT.jar:/Users/rafal.ostrowski/.m2/repository/org/jsweet/candies/sprintf-js/0.0.0-SNAPSHOT/sprintf-js-0.0.0-SNAPSHOT.jar:/Users/rafal.ostrowski/.m2/repository/org/jsweet/candies/jquery/1.10.0-SNAPSHOT/jquery-1.10.0-SNAPSHOT.jar
2017-02-20 17:33:32.032 DEBUG CandiesProcessor:120 - processed classes dir: .jsweet/candies/processed - /Users/rafal.ostrowski/Projects/ostryhub/jsweet-quickstart/.jsweet/candies/processed
2017-02-20 17:33:32.032 INFO  CandiesProcessor:131 - extracted candies directory: /Users/rafal.ostrowski/Projects/ostryhub/jsweet-quickstart/webapp
[INFO] source includes: {}
[INFO] source excludes: {}
[INFO] sources paths: [/Users/rafal.ostrowski/Projects/ostryhub/jsweet-quickstart/src/main/java]
[INFO] sourceFiles=[/Users/rafal.ostrowski/Projects/ostryhub/jsweet-quickstart/src/main/java/isssueWithInternalClassExtension/Base.java, /Users/rafal.ostrowski/Projects/ostryhub/jsweet-quickstart/src/main/java/isssueWithInternalClassExtension/Derived.java, /Users/rafal.ostrowski/Projects/ostryhub/jsweet-quickstart/src/main/java/quickstart/QuickStart.java]
2017-02-20 17:33:32.032 DEBUG JSweetTranspiler:268 - extra path: null
WARN: candy j4ts:0.2.0-SNAPSHOT was generated for a different version of the transpiler (current:1.2.0, candy:1.1.1)
2017-02-20 17:33:32.032 INFO  CandiesProcessor:205 - 4 candies found in classpath
2017-02-20 17:33:32.032 INFO  CandiesProcessor:159 - candies are up to date
2017-02-20 17:33:32.032 DEBUG JSweetTranspiler:703 - updated classpath: .jsweet/candies/processed:/Users/rafal.ostrowski/.m2/repository/org/jsweet/candies/j4ts/0.2.0-SNAPSHOT/j4ts-0.2.0-SNAPSHOT.jar:/Users/rafal.ostrowski/.m2/repository/org/jsweet/candies/jsweet-core/1.2.0-SNAPSHOT/jsweet-core-1.2.0-SNAPSHOT.jar:/Users/rafal.ostrowski/.m2/repository/org/jsweet/candies/sprintf-js/0.0.0-SNAPSHOT/sprintf-js-0.0.0-SNAPSHOT.jar:/Users/rafal.ostrowski/.m2/repository/org/jsweet/candies/jquery/1.10.0-SNAPSHOT/jquery-1.10.0-SNAPSHOT.jar
2017-02-20 17:33:32.032 DEBUG JSweetTranspiler:343 - classpath: .jsweet/candies/processed:/Users/rafal.ostrowski/.m2/repository/org/jsweet/candies/j4ts/0.2.0-SNAPSHOT/j4ts-0.2.0-SNAPSHOT.jar:/Users/rafal.ostrowski/.m2/repository/org/jsweet/candies/jsweet-core/1.2.0-SNAPSHOT/jsweet-core-1.2.0-SNAPSHOT.jar:/Users/rafal.ostrowski/.m2/repository/org/jsweet/candies/sprintf-js/0.0.0-SNAPSHOT/sprintf-js-0.0.0-SNAPSHOT.jar:/Users/rafal.ostrowski/.m2/repository/org/jsweet/candies/jquery/1.10.0-SNAPSHOT/jquery-1.10.0-SNAPSHOT.jar
2017-02-20 17:33:32.032 DEBUG JSweetTranspiler:344 - bootclasspath: null
2017-02-20 17:33:32.032 DEBUG JSweetTranspiler:345 - strict mode: false
2017-02-20 17:33:32.032 INFO  JSweetTranspiler:641 - parsing: RegularFileObject[/Users/rafal.ostrowski/Projects/ostryhub/jsweet-quickstart/src/main/java/isssueWithInternalClassExtension/Base.java],RegularFileObject[/Users/rafal.ostrowski/Projects/ostryhub/jsweet-quickstart/src/main/java/isssueWithInternalClassExtension/Derived.java],RegularFileObject[/Users/rafal.ostrowski/Projects/ostryhub/jsweet-quickstart/src/main/java/quickstart/QuickStart.java]
2017-02-20 17:33:33.033 INFO  JSweetTranspiler:646 - attribution phase
2017-02-20 17:33:33.033 INFO  JSweetTranspiler:768 - scanning /Users/rafal.ostrowski/Projects/ostryhub/jsweet-quickstart/src/main/java/isssueWithInternalClassExtension/Base.java...
2017-02-20 17:33:33.033 INFO  JSweetTranspiler:785 - output file: isssueWithInternalClassExtension/Base.ts
2017-02-20 17:33:33.033 INFO  JSweetTranspiler:803 - created /Users/rafal.ostrowski/Projects/ostryhub/jsweet-quickstart/target/ts/isssueWithInternalClassExtension/Base.ts
2017-02-20 17:33:33.033 INFO  JSweetTranspiler:768 - scanning /Users/rafal.ostrowski/Projects/ostryhub/jsweet-quickstart/src/main/java/isssueWithInternalClassExtension/Derived.java...
2017-02-20 17:33:33.033 INFO  JSweetTranspiler:785 - output file: isssueWithInternalClassExtension/Derived.ts
2017-02-20 17:33:33.033 INFO  JSweetTranspiler:803 - created /Users/rafal.ostrowski/Projects/ostryhub/jsweet-quickstart/target/ts/isssueWithInternalClassExtension/Derived.ts
2017-02-20 17:33:33.033 INFO  JSweetTranspiler:768 - scanning /Users/rafal.ostrowski/Projects/ostryhub/jsweet-quickstart/src/main/java/quickstart/QuickStart.java...
2017-02-20 17:33:33.033 INFO  JSweetTranspiler:785 - output file: quickstart/QuickStart.ts
2017-02-20 17:33:33.033 INFO  JSweetTranspiler:803 - created /Users/rafal.ostrowski/Projects/ostryhub/jsweet-quickstart/target/ts/quickstart/QuickStart.ts
2017-02-20 17:33:33.033 DEBUG JSweetTranspiler:1051 - ts2js: [/Users/rafal.ostrowski/Projects/ostryhub/jsweet-quickstart/src/main/java/isssueWithInternalClassExtension/Base.java, /Users/rafal.ostrowski/Projects/ostryhub/jsweet-quickstart/src/main/java/isssueWithInternalClassExtension/Derived.java, /Users/rafal.ostrowski/Projects/ostryhub/jsweet-quickstart/src/main/java/quickstart/QuickStart.java]
2017-02-20 17:33:33.033 INFO  JSweetTranspiler:1121 - launching tsc...
2017-02-20 17:33:33.033 DEBUG ProcessUtil:181 - run command: /Users/rafal.ostrowski/.jsweet-node_modules/bin/tsc --target ES3 --rootDir /Users/rafal.ostrowski/Projects/ostryhub/jsweet-quickstart/target/ts --outDir /Users/rafal.ostrowski/Projects/ostryhub/jsweet-quickstart/target/js .tsc-rootfile.ts isssueWithInternalClassExtension/Base.ts isssueWithInternalClassExtension/Derived.ts quickstart/QuickStart.ts ../../.jsweet/candies/typings/src/typings/j4ts/0.2.0-SNAPSHOT/.tsc-rootfile.d.ts ../../.jsweet/candies/typings/src/typings/j4ts/0.2.0-SNAPSHOT/bundle.d.ts ../../.jsweet/candies/typings/src/typings/jquery/jquery.d.ts ../../.jsweet/candies/typings/src/typings/sprintf-js/sprintf-js.d.ts
2017-02-20 17:33:36.036 INFO  JSweetTranspiler:1132 - isssueWithInternalClassExtension/Derived.ts(3,18): error TS2417: Class static side 'typeof Derived' incorrectly extends base class static side 'typeof Base'.
ERROR: class static side 'typeof Derived' incorrectly extends base class static side 'typeof Base' at /Users/rafal.ostrowski/Projects/ostryhub/jsweet-quickstart/src/main/java/isssueWithInternalClassExtension/Derived.java(3)
2017-02-20 17:33:36.036 INFO  JSweetTranspiler:1132 -   Types of property 'Properties' are incompatible.
2017-02-20 17:33:36.036 INFO  JSweetTranspiler:1132 -     Type 'typeof isssueWithInternalClassExtension.Derived.Properties' is not assignable to type 'typeof isssueWithInternalClassExtension.Base.Properties'.
2017-02-20 17:33:36.036 INFO  JSweetTranspiler:721 - transpilation process finished in 3576 ms
[ERROR] transpilation failed
org.apache.maven.plugin.MojoFailureException: transpilation failed with 1 error(s) and 1 warning(s)
	at org.jsweet.AbstractJSweetMojo.transpile(AbstractJSweetMojo.java:337)
	at org.jsweet.JSweetMojo.execute(JSweetMojo.java:41)
	at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo(DefaultBuildPluginManager.java:101)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:209)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:153)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:145)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:84)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:59)
	at org.apache.maven.lifecycle.internal.LifecycleStarter.singleThreadedBuild(LifecycleStarter.java:183)
	at org.apache.maven.lifecycle.internal.LifecycleStarter.execute(LifecycleStarter.java:161)
	at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:320)
	at org.apache.maven.DefaultMaven.execute(DefaultMaven.java:156)
	at org.apache.maven.cli.MavenCli.execute(MavenCli.java:537)
	at org.apache.maven.cli.MavenCli.doMain(MavenCli.java:196)
	at org.apache.maven.cli.MavenCli.main(MavenCli.java:141)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:497)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced(Launcher.java:290)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launch(Launcher.java:230)
	at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode(Launcher.java:409)
	at org.codehaus.plexus.classworlds.launcher.Launcher.main(Launcher.java:352)
	at org.codehaus.classworlds.Launcher.main(Launcher.java:47)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:497)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:144)
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 4.417s
[INFO] Finished at: Mon Feb 20 17:33:36 GMT 2017
[INFO] Final Memory: 13M/210M
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.jsweet:jsweet-maven-plugin:1.2.0:jsweet (generate-js) on project jsweet-quickstart: transpilation failed: transpilation failed with 1 error(s) and 1 warning(s) -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoExecutionException

Process finished with exit code 1


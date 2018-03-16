
java_library(
	name = 'test-java-src',
	sources = globs('*.java'),
)

jvm_binary(
	name = 'test-java',
	main = 'HelloJava',
	dependencies = [ ':test-java-src' ],
)

scala_library(
	name = 'test-scala-src',
	sources = globs('*.scala'),
)

jvm_binary(
	name = 'test-scala',
	main = 'HelloScala',
	dependencies = [ ':test-scala-src' ],
)

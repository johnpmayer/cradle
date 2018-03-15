
java_library(
	name = 'test-java-src',
	sources = globs('*.java'),
)

jvm_binary(
	main = 'Hello',
	dependencies = [ ':test-java-src' ],
)

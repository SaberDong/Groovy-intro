package groovy

String [] greetings = ["hello", "Hi", "Howdy"]

for (String greet : greetings) {
	println greet
}

for (def greet2 : greetings) {
	println greet2
}

for (greet3 in greetings) {
	println greet3
}
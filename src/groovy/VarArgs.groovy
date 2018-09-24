package groovy

def receiveVarArgs(int a, int... b) {
	println "You passed $a and $b"
}

def receiveArray(int a, int[] b) {
	println "You passed $a and $b"
}

receiveVarArgs(1, 2, 3, 4, 5)
receiveArray(1, 2, 3, 4, 5)

int[] values = [2, 3, 4, 5] 
receiveVarArgs(1, values)

receiveArray(1, [2, 3] as int[])

//报错
//receiveArray(1, [2, 3, 4])

println XmlParser.class
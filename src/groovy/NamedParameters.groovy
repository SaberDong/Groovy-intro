package groovy

class Robot {

	def type, height, width
	def access(location, weight, fragile) {
		println "Received fragile? $fragile, weight: $weight, loc: $location"
	}
	
	//显示地将第一个形参指定为Map
	def access2(Map location, weight, fragile) {
		println "Received fragile? $fragile, weight: $weight, loc: $location"
	}
	
	//显示地指定两个Map形参
	def access3(Map location, Map weight, fragile) {
		println "Received fragile? $fragile, weight: $weight, loc: $location"
	}
	
}
robot = new Robot(type: 'arm', width: 10, height: 40)
println "$robot.type, $robot.height, $robot.width"

//如果发送的实参的个数多于方法的形参的个数，而且多出的实参是名值对，那么Groovy会假设方法的第一个形参是一个Map，
//然后将实参列表中的所有名值对组织到一起，作为第一个形参的值，之后，再将剩下的实参按照给出的顺序赋给其余形参。
robot.access(x: 30, y: 20, z: 10, 50, true)

//可以修改参数顺序
robot.access(50, true, x: 30, y: 20, z: 10)

//传递三个整型实参
robot.access(10, 20, 30)

robot.access2(o: 10, p: 10, q: 10, 10, true);

robot.access2(s: 10, 20, 30)

robot.access3([x: 30, o: 40], [y: 20], true)

//少一个实参，报错
//robot.access3(x: 30, true)
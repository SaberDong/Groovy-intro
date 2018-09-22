package groovy

/*
 * 1. helloworld
 */
println "Hello Groovy!!!";

def s = """
    知识点:
    1>可以用多种方式定义变量
    2>如何在控制台输出文本
    3>如何方便的显示多行文本

"""
/*
 * 2. 如何定义函数
 * 知识点:
    1>如何定义和函数
    2>如何在函数里定义默认参数
 */
println(s);

//1
def func(a,b) {
	println("Your name is : " + a + " and your age is: " + b);
}

func("Saber", 27);

//2
def func2(a, b=25) {
	if (b==null) {
		println("Your name is : " + a + " and your age is a secret. ");
	}else {
		println("Your name is : " + a + " and your age is: " + b);
	}
}

func2("Jason");
func2("Rambo", 28);
func2("Annie", null);

/*
 * 
Your name is : Saber and your age is: 27
Your name is : Jason and your age is: 25
Your name is : Rambo and your age is: 28
Your name is : Annie and your age is a secret.
 */

/*
 * 3. 字符串使用
 */
def country = "南非";

def stringTemplate(country) {
	return "${country}世界杯来了";
}

def str = stringTemplate(country);

println(str + ",length: " + str.length());

println("Country is: " + str[0,2]);
println("Country is: " + str.substring(0,2));

def greetingWithFormat = """
    欢迎来到${country}
  6.11-7.11,世界杯将会激情展开！
""";

println(greetingWithFormat);

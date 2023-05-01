fun main(args: Array<String>) {
	var i = 0;
	while (i++ < 100) {
		println(i)
		if (i == 3) {
			break
		}

	}

	//Kotlin label is the form of identifier followed by the @ sign, for example test@ or outer@. To make any Kotlin Expression as labeled one, we just need to put a label in front of the expression.

	outerLoop@ for (i in 1..3) {
		innerLoop@ for (j in 1..3) {
			println("i = $i and j = $j")
			if (i == 2) {
				break@outerLoop
			}
		}
	}
}
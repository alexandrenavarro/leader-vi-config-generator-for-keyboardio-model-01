package com.github.alexandrenavarro.leaderviconfiggeneratorforkeyboardiomodel01

fun main(args: Array<String>) {

	var commandsWithPrefixAndSuffix: List<Any> = listOf<String>("d", "x", "y")
	var commandsWithPrefix: List<Any> = listOf<String>("u", "p", "m")
	var commandsWithLongPrefix: List<Any> = listOf<String>("g")


	for (commandWithPrefix in commandsWithPrefix) {
		for (prefix in 1..99) {
			println("static void leader_${prefix}${commandWithPrefix}(uint8_t seq_index) { leader_${prefix}${commandWithPrefix}(seq_index, ${prefix});}")
		}
	}

	for (commandWithLongPrefix in commandsWithLongPrefix) {
		for (prefix in 1..9999) {
			println("static void leader_${prefix}${commandWithLongPrefix}(uint8_t seq_index) { leader_${prefix}${commandWithLongPrefix}(seq_index, ${prefix});}")
		}
	}

}

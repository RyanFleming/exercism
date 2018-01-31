/*
* Solution by Ryan Fleming
* 1/30/18
* All Rights Reserved
 */

class Bob {
    hey(greeting: string) {
        if (greeting === greeting.toUpperCase() && greeting.match(/[a-z]/i)) {
            return "Whoa, chill out!"
        } else if (greeting.substr(greeting.length - 1) === "?") {
            return "Sure."
        } else if (!greeting.replace(/\s/g, "").length) {
            return "Fine. Be that way!"
        } else {
            return "Whatever."
        }
    }
}

export default Bob

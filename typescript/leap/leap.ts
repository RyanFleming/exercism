/*
 * Solution by Ryan Fleming
 * 1/28/18
 * All Rights Reserved
 */

function isLeapYear(year: number) {
  return (
      (year % 4 === 0 && year % 100 !== 0) ||
      (year % 4 === 0 && year % 100 === 0 && year % 400 === 0)
  )
}

export default isLeapYear

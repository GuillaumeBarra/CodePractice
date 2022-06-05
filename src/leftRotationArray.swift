import Foundation

func leftRotation(a: [Int], d: Int) -> [Int] {
    let arrSlice1 = a[..<d]
    let arrSlice2 = a[d...]
    return (Array(arrSlice2) + Array(arrSlice1))
}

print(leftRotation(a: [1,2,3,4,5], d: 2))
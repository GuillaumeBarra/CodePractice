func minimumBribes(q: [Int]) -> Void {
    var count = 0
    var isChaotic = false
   
    for i in stride(from: (q.count-1), through: 0, by: -1) {
        if (q[i] - (i+1) > 2) {
            isChaotic = true
            break
        }
        for j in stride(from: max(0, q[i]-2), to: i, by: 1){
            if q[j] > q[i] {
                count += 1
            }
        }
    }
    isChaotic ? print("Too chaotic") : print(count)
}


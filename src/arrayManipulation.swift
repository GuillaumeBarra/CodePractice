    func arrayManipulation(_ n: Int, _ queries: [[Int]]) -> Int {
        var tmp = [Int](repeating: 0, count: n+1)

        for i in 0..<queries.count {
            tmp[queries[i][0] - 1] += queries[i][2]
            tmp[queries[i][1]] -= queries[i][2]
        }

        var ans = Int.min
        var sum = 0
        for t in tmp {
            sum += t
            ans = max(ans, sum)
        }

        return ans
    }

    //O(max(n, m)) time complexity (n is number of elements, m is query length)
    //O(n) space complexity
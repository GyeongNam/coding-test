function solution(sequence, k) {
    let result = [0, 0];
    let minLength = Number.MAX_VALUE;
    let sum = 0;
    let start = 0;

    for (let end = 0; end < sequence.length; end++) {
        sum += sequence[end];

        while (sum > k) {
            sum -= sequence[start];
            start++;
        }

        if (sum === k && end - start < minLength) {
            minLength = end - start;
            result[0] = start;
            result[1] = end;
        }
    }

    return minLength === Number.MAX_VALUE ? [] : result;
}
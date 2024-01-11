function solution(operations) {
const ts = new Set();

        for (const opStr of operations) {
            const st = opStr.split(" ");

            if (st[0] === "I") {
                const value = parseInt(st[1]);
                ts.add(value);
            } else if (ts.size > 0 && opStr === "D 1") {
                ts.delete(Math.max(...Array.from(ts.values())));
            } else if (ts.size > 0 && opStr === "D -1") {
                ts.delete(Math.min(...Array.from(ts.values())));
            }
        }

        return ts.size === 0 ? [0, 0] : [Math.max(...Array.from(ts.values())), Math.min(...Array.from(ts.values()))];
}
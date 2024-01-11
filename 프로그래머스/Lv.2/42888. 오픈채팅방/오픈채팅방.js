function solution(record) {
    let map = new Map();
    let changeCount = 0;

    for (let i = 0; i < record.length; i++) {
        let strArr = record[i].split(" ");

        if (strArr[0] === "Leave") {
            continue;
        } else if (strArr[0] === "Change") {
            changeCount++;
        }

        map.set(strArr[1], strArr[2]);
    }

    let answer = new Array(record.length - changeCount);
    let index = 0;

    for (let i = 0; i < record.length; i++) {
        let strArr = record[i].split(" ");

        if (strArr[0] === "Enter") {
            answer[index] = `${map.get(strArr[1])}님이 들어왔습니다.`;
            index++;
        } else if (strArr[0] === "Leave") {
            answer[index] = `${map.get(strArr[1])}님이 나갔습니다.`;
            index++;
        }
    }

    return answer;
}
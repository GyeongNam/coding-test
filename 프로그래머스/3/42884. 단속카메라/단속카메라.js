function solution(routes) {
    var answer = 1
    routes.sort((a,b)=> a[1] - b[1])
    var camera = routes[0][1]
    for (const route of routes) {
        if(camera < route[0]){
            camera = route[1]
            answer++
        }
    }
    return answer
}
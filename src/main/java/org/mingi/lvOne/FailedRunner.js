main();
function main(){
  const participant = ["mislav", "stanko", "mislav", "ana"];
  const completion = ["stanko", "ana", "mislav"];

  const result = solution(participant, completion);

  if(result === "mislav"){
    console.log("통과");
  }else{
    console.log("실패");
    console.log(result)
  }
}
function solution(participant, completion) {
  const partiObj = {};
  participant.forEach(a => partiObj[a] = partiObj[a] ? partiObj[a]+1 : 1)
  completion.forEach(b => {
    const cnt = partiObj[b];
    cnt === 1 ? delete partiObj[b] : partiObj[b]--;
  })

  return Object.keys(partiObj)[0];
}

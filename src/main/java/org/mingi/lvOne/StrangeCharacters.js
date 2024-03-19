main();
function main(){
  const result = solution("try hello world ");

  if(result === "TrY HeLlO WoRlD "){
    console.log("통과");
  }else{
    console.log("실패");
    console.log(result)
  }
}
function solution(s) {
  let answer = '';

  let cnt = 0
  for(let i=0; i < s.length; i++ ){
    const targetChar = s.charAt(i);

    if(targetChar === ' '){
      answer += ' ';
      cnt = 0;
    }else if(cnt%2 === 0){
      answer += targetChar.toUpperCase();
      cnt++;
    }else{
      answer += targetChar.toLowerCase();
      cnt++;
    }

  }
  return answer;
}

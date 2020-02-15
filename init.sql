create table project(
	name varchar(50) not null,
	comment varchar(250) not null,
	detail varchar(100) not null,
	git varchar(150) not null
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into project values("drawMind"," 넷마블 캐치마인드 게임을 자바로 이용해 모방해본 프로젝트입니다.","drawMind","https://github.com/dobidugi/drawMind");
insert into project values("CLOUD","  웹 클라우드 프로젝트입니다. 자기만의 개인 저장공간을 가질수있고 여러유저들과 파일을 공유도 가능합니다.","NAS","https://github.com/dobidugi/NAS");

create table parsesite(
	`name` varchar(100) not null,
	`namelink` varchar(100) not null,
	`nick` varchar(100) not null,
	`nicklink` varchar(100) not null,
	`rank` varchar(50) not null,
	`solve` varchar(50) not null,
	`time` DATETIME not null
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
insert into parsesite values("Baekjoon","https://www.acmicpc.net","dobidugi","https://www.acmicpc.net/user/dobidugi","123","0",now());
insert into parsesite values("Codeup","https://codeup.kr","chocojoahhae2","https://codeup.kr/userinfo.php?user=chocojoahhae2","123","0",now());


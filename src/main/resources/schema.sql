create table if not exists Ingredient (
  id varchar(4) not null unique,
  name varchar(25) not null,
  type varchar(10) not null
);

create table if not exists Taco (
  id bigint unique auto_increment,
  name varchar(50) not null,
  createdAt datetime not null
);

create table if not exists Taco_Ingredients (
  taco bigint not null,
  ingredient varchar(4) not null
);

alter table Taco_Ingredients
    add foreign key (taco) references Taco(id);
alter table Taco_Ingredients
    add foreign key (ingredient) references Ingredient(id);

create table if not exists Taco_Order (
	id bigint unique auto_increment,
	name varchar(50) not null,
	street varchar(50) not null,
	city varchar(50) not null,
	state varchar(20) not null,
	zip varchar(10) not null,
	ccNumber varchar(16) not null,
	ccExpiration varchar(5) not null,
	ccCVV varchar(3) not null,
    placedAt datetime not null
);

create table if not exists Taco_Order_Tacos (
	tacoOrder bigint not null,
	taco bigint not null
);

alter table Taco_Order_Tacos
    add foreign key (tacoOrder) references Taco_Order(id);
alter table Taco_Order_Tacos
    add foreign key (taco) references Taco(id);

create table if not exists User (
    id bigint unique auto_increment,
    username varchar(100) not null,
    password varchar(100) not null,
    fullname varchar(100) not null,
    street varchar(100) not null,
    city varchar(100) not null,
    state varchar(100) not null,
    zip varchar(100) not null,
    phoneNumber varchar(100) not null
);

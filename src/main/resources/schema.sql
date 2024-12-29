create schema if not exists deviceshop;

create table if not exists users(
    id bigserial primary key,
    name varchar(255) not null,
    username varchar(255) not null unique,
    password varchar(255) not null
);


create table if not exists devices(
    id bigserial primary key,
    name varchar(255) not null,
    price int not null,
    description varchar(255) null,
    status varchar(255) not null,
    expiration_date timestamp null
);

create table if not exists users_devices(
    user_id bigint not null,
    device_id bigint not null,
    primary key (user_id, device_id),
    constraint fk_users_devices_users foreign key (user_id) references users (id) on delete cascade on update no action,
    constraint fk_users_devices_devices foreign key (device_id) references devices (id) on delete cascade on update no action
);

create table if not exists users_roles(
    user_id bigint not null,
    role varchar(255) not null,
    primary key (user_id, role),
    constraint fk_users_role_users foreign key (user_id) references users (id) on delete cascade on update no action
);
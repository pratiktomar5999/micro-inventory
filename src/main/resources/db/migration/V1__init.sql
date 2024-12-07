Create table 't_inventory'
{
    'id' bigint(20) NOT NULL AUTO_INCREMENT,
    'sku_code' varchar(255) Default null,
    'quantity' int(11) default null,
    Primary key ('id')
}
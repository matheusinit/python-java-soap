from zeep import Client

client = Client('')
result = client.service.ConvertSpeed(
    100, 'KmPorhora', 'milhasPorhora')

assert result == 62.137
# Getting Started

- Register in [Nasa](https://api.nasa.gov/) and get API key
- run application PicturesApplication and pass api key to -DNASA_API_KEY=api_key

- trigger API via curl command

```curl
curl --location 'http://localhost:8080/collect/pictures' \
--header 'Content-Type: application/json' \
--data '{
    "sol":16
 }'
```

response status 200 OK:

```json
{
    "NasaCamera[id=21, name=RHAZ, roverId=5, fullName=Rear Hazard Avoidance Camera]": [
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/rcam/RRA_398917119EDR_F0030054RHAZ00130M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/rcam/RRA_398919443EDR_F0030078RHAZ00302M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/rcam/RLA_398919443EDR_F0030078RHAZ00302M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/rcam/RRA_398917538EDR_F0030066RHAZ00130M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/rcam/RLA_398917538EDR_F0030066RHAZ00130M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/rcam/RLA_398917361EDR_F0030060RHAZ00130M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/rcam/RRA_398917361EDR_F0030060RHAZ00130M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/rcam/RLA_398917119EDR_F0030054RHAZ00130M_.JPG",
            "earthDate": "2012-08-22"
        }
    ],
    "NasaCamera[id=26, name=NAVCAM, roverId=5, fullName=Navigation Camera]": [
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NLA_398917167EDR_F0030054NCAM00132M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NRA_398919509EDR_F0030078NCAM00300M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NLA_398920558EDR_F0030078NCAM00302M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NLA_398920523EDR_F0030078NCAM00302M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NLA_398920488EDR_F0030078NCAM00302M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NLA_398920451EDR_F0030078NCAM00304M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NLA_398920416EDR_F0030078NCAM00304M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NLA_398920382EDR_F0030078NCAM00304M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NLA_398920346EDR_F0030078NCAM00304M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NLA_398920312EDR_F0030078NCAM00304M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NLA_398920279EDR_F0030078NCAM00304M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NLA_398920191EDR_F0030078NCAM00304M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NLA_398920122EDR_F0030078NCAM00303M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NLA_398920087EDR_F0030078NCAM00303M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NLA_398920052EDR_F0030078NCAM00303M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NLA_398920017EDR_F0030078NCAM00303M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NLA_398919983EDR_F0030078NCAM00303M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NLA_398919948EDR_F0030078NCAM00303M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NLA_398919855EDR_F0030078NCAM00303M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NLA_398919819EDR_F0030078NCAM00301M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NLA_398919784EDR_F0030078NCAM00301M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NLA_398919757EDR_F0030078NCAM00301M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NLA_398919728EDR_F0030078NCAM00301M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NLA_398919692EDR_F0030078NCAM00301M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NLA_398919642EDR_F0030078NCAM00300M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NLA_398919607EDR_F0030078NCAM00300M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NLA_398919572EDR_F0030078NCAM00300M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NLA_398919544EDR_F0030078NCAM00300M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NLA_398919509EDR_F0030078NCAM00300M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NLA_398919391EDR_F0030078NCAM00113M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NLA_398919347EDR_F0030078NCAM00119M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NLA_398917610EDR_F0030066NCAM00133M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NLA_398917564EDR_F0030066NCAM00132M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NLA_398917433EDR_F0030060NCAM00132M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NLA_398917381EDR_F0030060NCAM00133M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NLA_398917211EDR_F0030054NCAM00133M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NRA_398920558EDR_F0030078NCAM00302M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NRA_398920523EDR_F0030078NCAM00302M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NRA_398920488EDR_F0030078NCAM00302M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NRA_398920451EDR_F0030078NCAM00304M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NRA_398920416EDR_F0030078NCAM00304M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NRA_398920382EDR_F0030078NCAM00304M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NRA_398920346EDR_F0030078NCAM00304M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NRA_398920312EDR_F0030078NCAM00304M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NRA_398920279EDR_F0030078NCAM00304M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NRA_398920191EDR_F0030078NCAM00304M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NRA_398920122EDR_F0030078NCAM00303M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NRA_398920087EDR_F0030078NCAM00303M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NRA_398920052EDR_F0030078NCAM00303M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NRA_398920017EDR_F0030078NCAM00303M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NRA_398919983EDR_F0030078NCAM00303M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NRA_398919948EDR_F0030078NCAM00303M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NRA_398919855EDR_F0030078NCAM00303M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NRA_398919819EDR_F0030078NCAM00301M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NRA_398919784EDR_F0030078NCAM00301M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NRA_398919757EDR_F0030078NCAM00301M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NRA_398919728EDR_F0030078NCAM00301M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NRA_398919692EDR_F0030078NCAM00301M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NRA_398919642EDR_F0030078NCAM00300M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NRA_398919607EDR_F0030078NCAM00300M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NRA_398919572EDR_F0030078NCAM00300M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/ncam/NRA_398919544EDR_F0030078NCAM00300M_.JPG",
            "earthDate": "2012-08-22"
        }
    ],
    "NasaCamera[id=20, name=FHAZ, roverId=5, fullName=Front Hazard Avoidance Camera]": [
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/fcam/FRA_398917092EDR_F0030054FHAZ00130M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/fcam/FRA_398919417EDR_F0030078FHAZ00302M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/fcam/FLA_398919417EDR_F0030078FHAZ00302M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/fcam/FRA_398917511EDR_F0030066FHAZ00130M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/fcam/FLA_398917511EDR_F0030066FHAZ00130M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/fcam/FLA_398917334EDR_F0030060FHAZ00130M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/fcam/FRA_398917334EDR_F0030060FHAZ00130M_.JPG",
            "earthDate": "2012-08-22"
        },
        {
            "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/fcam/FLA_398917092EDR_F0030054FHAZ00130M_.JPG",
            "earthDate": "2012-08-22"
        }
    ]
}
```


- long to database via [UI](http://localhost:8080/h2-console/)

<img width="478" alt="image" src="https://github.com/BlyznytsiaOrg/bring/assets/73576438/376934e3-ff68-45f6-8451-e0fc89fbd707">

- after connect try to fetch data from tables:

<img width="797" alt="image" src="https://github.com/BlyznytsiaOrg/bring/assets/73576438/252d462c-c8b3-437e-b94b-1fffd7eddf0d">

<img width="1505" alt="image" src="https://github.com/BlyznytsiaOrg/bring/assets/73576438/93aa9ca5-120d-482b-baaa-0a92a37bcaec">





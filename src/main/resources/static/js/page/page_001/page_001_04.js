'use strict';

let map;
let coords;
$(document).ready(function (){

    
    let container = document.getElementById('map');
    let options = {
        center: new kakao.maps.LatLng(33.450701, 126.570667),
        level: 3
    };
    map = new kakao.maps.Map(container, options);
    let geocoder = new kakao.maps.services.Geocoder();
    // 주소로 좌표를 검색합니다
    geocoder.addressSearch('경기도 부천시 부흥로 405', function(result, status) {

    // 정상적으로 검색이 완료됐으면 
    if (status === kakao.maps.services.Status.OK) {

        coords = new kakao.maps.LatLng(result[0].y, result[0].x);

        // 결과값으로 받은 위치를 마커로 표시합니다
        let marker = new kakao.maps.Marker({
            map: map,
            position: coords
        });

        // 인포윈도우로 장소에 대한 설명을 표시합니다
        let infowindow = new kakao.maps.InfoWindow({
            content: '<div style="width:150px;text-align:center;padding:6px 0;">심곡천교회</div>'
        });
        infowindow.open(map, marker);

        // 지도의 중심을 결과값으로 받은 위치로 이동시킵니다
        map.setCenter(coords);
        } 
    });    

    $(window).on('resize', () => {
        map.setCenter(coords);
    });
    
});


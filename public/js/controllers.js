function PhoneListCtrl($scope) {
  $scope.phones = [
    {"name": "Nexus S",
     "snippet": "Fast just got faster with Nexus S."},
    {"name": "Motorola XOOM™ with Wi-Fi",
     "snippet": "The Next, Next Generation tablet."},
    {"name": "MOTOROLA XOOM™",
     "snippet": "The Next, Next Generation tablet."}
  ];

  $scope.hello = "Hello, World!"
}

//'use strict';
//
///* Controllers */
//
//function PhoneListCtrl($scope, Phone) {
//  $scope.phones = Phone.query();
//  $scope.orderProp = 'age';
//}
//
////PhoneListCtrl.$inject = ['$scope', 'Phone'];
//
//
//
//function PhoneDetailCtrl($scope, $routeParams, Phone) {
//  $scope.phone = Phone.get({phoneId: $routeParams.phoneId}, function(phone) {
//    $scope.mainImageUrl = phone.images[0];
//  });
//
//  $scope.setImage = function(imageUrl) {
//    $scope.mainImageUrl = imageUrl;
//  }
//}
//
////PhoneDetailCtrl.$inject = ['$scope', '$routeParams', 'Phone'];

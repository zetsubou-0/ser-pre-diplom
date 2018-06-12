window.$ = window.jQuery;

var LASER = (function (LASER, $) {

    // Augmenting shared objects and arrays
    LASER.modules = LASER.modules || {};

    LASER.initMods = function () {
        for (var mod in LASER.modules) {
            try {
                var $self = $(LASER.modules[mod].selfSelector);
                // Run required modules with default selector
                if (typeof LASER.modules === 'undefined') {
                    console.log("No LASER modules found for page.");
                    return;
                }
                if ($self.length) {
                    LASER.modules[mod].init($self);
                }
            } catch (e) {
                if (LASER.utils.isAuthMode()) {
                    console.log(e);
                }
            }
        }
    };
    return LASER;
})(LASER || {}, jQuery);


jQuery(function () {
    LASER.initMods();
});

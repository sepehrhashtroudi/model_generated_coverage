var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":76,"id":34453,"methods":[{"el":50,"sc":1,"sl":44},{"el":62,"sc":1,"sl":53}],"name":"TestConfig","sl":12},{"el":16,"id":34453,"methods":[],"name":"TestConfig.Dummy","sl":16},{"el":18,"id":34453,"methods":[],"name":"TestConfig.EmptyDummy","sl":18},{"el":25,"id":34453,"methods":[{"el":24,"sc":9,"sl":23}],"name":"TestConfig.AnnoBean","sl":20},{"el":27,"id":34455,"methods":[],"name":"TestConfig.Alpha","sl":27},{"el":31,"id":34455,"methods":[],"name":"TestConfig.SimpleBean","sl":29}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_247":{"methods":[{"sl":23},{"sl":53}],"name":"testAnnotationsDisabled577","pass":true,"statements":[{"sl":24},{"sl":54},{"sl":55},{"sl":56},{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":61}]},"test_381":{"methods":[{"sl":44}],"name":"testOverrideIntrospectors150","pass":true,"statements":[{"sl":45},{"sl":46},{"sl":47},{"sl":48},{"sl":49}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [247], [247], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [381], [381], [381], [381], [381], [381], [], [], [], [247], [247], [247], [247], [247], [247], [247], [247], [247], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]

var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":87,"id":5315,"methods":[{"el":40,"sc":3,"sl":36},{"el":52,"sc":1,"sl":43},{"el":60,"sc":1,"sl":55}],"name":"FieldExclusionTest","sl":31},{"el":75,"id":5332,"methods":[],"name":"FieldExclusionTest.Outer","sl":68},{"el":73,"id":5332,"methods":[{"el":72,"sc":7,"sl":70}],"name":"FieldExclusionTest.Outer.Inner","sl":69},{"el":86,"id":5334,"methods":[{"el":81,"sc":5,"sl":79},{"el":85,"sc":5,"sl":83}],"name":"FieldExclusionTest.NestedClass","sl":77}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_198":{"methods":[{"sl":55},{"sl":70},{"sl":79}],"name":"testInnerClassExclusion178","pass":true,"statements":[{"sl":56},{"sl":57},{"sl":58},{"sl":59},{"sl":71},{"sl":80}]},"test_7":{"methods":[{"sl":43},{"sl":70},{"sl":79},{"sl":83}],"name":"testDefaultNestedStaticClassIncluded6","pass":true,"statements":[{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":71},{"sl":80},{"sl":84}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [7], [7], [7], [7], [7], [7], [7], [7], [7], [], [], [], [198], [198], [198], [198], [198], [], [], [], [], [], [], [], [], [], [], [7, 198], [7, 198], [], [], [], [], [], [], [], [7, 198], [7, 198], [], [], [7], [7], [], [], []]

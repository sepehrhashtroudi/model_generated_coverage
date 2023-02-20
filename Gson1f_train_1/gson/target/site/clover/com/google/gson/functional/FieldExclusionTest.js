var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":79,"id":5329,"methods":[{"el":40,"sc":3,"sl":36},{"el":52,"sc":1,"sl":43}],"name":"FieldExclusionTest","sl":31},{"el":67,"id":5341,"methods":[],"name":"FieldExclusionTest.Outer","sl":60},{"el":65,"id":5341,"methods":[{"el":64,"sc":7,"sl":62}],"name":"FieldExclusionTest.Outer.Inner","sl":61},{"el":78,"id":5343,"methods":[{"el":73,"sc":5,"sl":71},{"el":77,"sc":5,"sl":75}],"name":"FieldExclusionTest.NestedClass","sl":69}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_57":{"methods":[{"sl":43},{"sl":62},{"sl":71},{"sl":75}],"name":"testDefaultNestedStaticClassIncluded8","pass":true,"statements":[{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":63},{"sl":72},{"sl":76}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [57], [57], [57], [57], [57], [57], [57], [57], [57], [], [], [], [], [], [], [], [], [], [], [57], [57], [], [], [], [], [], [], [], [57], [57], [], [], [57], [57], [], [], []]

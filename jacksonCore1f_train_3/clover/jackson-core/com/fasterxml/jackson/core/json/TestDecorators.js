var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":109,"id":15835,"methods":[{"el":89,"sc":1,"sl":73},{"el":104,"sc":1,"sl":92}],"name":"TestDecorators","sl":17},{"el":45,"id":15835,"methods":[{"el":32,"sc":9,"sl":27},{"el":39,"sc":9,"sl":34},{"el":44,"sc":9,"sl":41}],"name":"TestDecorators.SimpleInputDecorator","sl":25},{"el":64,"id":15841,"methods":[{"el":55,"sc":9,"sl":49},{"el":63,"sc":9,"sl":57}],"name":"TestDecorators.SimpleOutputDecorator","sl":47}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_107":{"methods":[{"sl":27},{"sl":34},{"sl":41},{"sl":73}],"name":"testInputDecoration132","pass":true,"statements":[{"sl":31},{"sl":38},{"sl":43},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":78},{"sl":79},{"sl":80},{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86},{"sl":87},{"sl":88}]},"test_53":{"methods":[{"sl":49},{"sl":57},{"sl":92}],"name":"testOutputDecoration134","pass":true,"statements":[{"sl":52},{"sl":53},{"sl":54},{"sl":60},{"sl":61},{"sl":62},{"sl":93},{"sl":94},{"sl":95},{"sl":96},{"sl":97},{"sl":98},{"sl":99},{"sl":100},{"sl":101},{"sl":102},{"sl":103}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [107], [], [], [], [107], [], [], [107], [], [], [], [107], [], [], [107], [], [107], [], [], [], [], [], [53], [], [], [53], [53], [53], [], [], [53], [], [], [53], [53], [53], [], [], [], [], [], [], [], [], [], [], [107], [107], [107], [107], [107], [107], [107], [107], [107], [107], [107], [107], [107], [107], [107], [107], [], [], [], [53], [53], [53], [53], [53], [53], [53], [53], [53], [53], [53], [53], [], [], [], [], [], []]

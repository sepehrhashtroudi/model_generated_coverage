var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":77,"id":17338,"methods":[{"el":23,"sc":5,"sl":11}],"name":"ViewMatcher","sl":7},{"el":41,"id":17349,"methods":[{"el":40,"sc":9,"sl":37}],"name":"ViewMatcher.Empty","sl":31},{"el":54,"id":17351,"methods":[{"el":49,"sc":9,"sl":49},{"el":53,"sc":9,"sl":50}],"name":"ViewMatcher.Single","sl":43},{"el":76,"id":17355,"methods":[{"el":63,"sc":9,"sl":63},{"el":75,"sc":9,"sl":65}],"name":"ViewMatcher.Multi","sl":56}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_13":{"methods":[{"sl":11},{"sl":49},{"sl":50},{"sl":63},{"sl":65}],"name":"testSimple301","pass":true,"statements":[{"sl":13},{"sl":16},{"sl":19},{"sl":20},{"sl":22},{"sl":49},{"sl":52},{"sl":63},{"sl":68},{"sl":69},{"sl":70},{"sl":71},{"sl":74}]},"test_419":{"methods":[{"sl":11},{"sl":37},{"sl":49},{"sl":50}],"name":"testWithoutDefaultInclusion374","pass":true,"statements":[{"sl":13},{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":20},{"sl":39},{"sl":49},{"sl":52}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [419, 13], [], [419, 13], [], [], [419, 13], [419], [419], [419, 13], [419, 13], [], [13], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [419], [], [419], [], [], [], [], [], [], [], [], [], [419, 13], [419, 13], [], [419, 13], [], [], [], [], [], [], [], [], [], [], [13], [], [13], [], [], [13], [13], [13], [13], [], [], [13], [], [], []]

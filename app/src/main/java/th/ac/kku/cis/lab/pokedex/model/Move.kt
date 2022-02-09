package th.ac.kku.cis.lab.pokedex.model

data class Move(
    val move: MoveX,
    val version_group_details: List<VersionGroupDetail>
)